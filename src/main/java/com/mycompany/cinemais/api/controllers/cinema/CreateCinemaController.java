package com.mycompany.cinemais.api.controllers.cinema;

import com.mycompany.cinemais.api.controllers.ConsoleController;
import com.mycompany.cinemais.app.cinema.services.CinemaService;
import com.mycompany.cinemais.app.common.dtos.ControllerContextDto;
import com.mycompany.cinemais.app.common.enums.RouteAction;
import com.mycompany.cinemais.domain.cinema.dtos.CreateCinemaDto;
import com.mycompany.cinemais.domain.cinema.services.ICinemaService;
import com.mycompany.cinemais.domain.helpers.IReader;

public class CreateCinemaController extends ConsoleController {
  public ICinemaService cinemaService;

  public CreateCinemaController(IReader reader) {
    super(reader);
    cinemaService = new CinemaService();
  }

  private ControllerContextDto internalRun() throws Exception {
    var createCinemaDto = new CreateCinemaDto();

    System.out.println("Insira o nome do shopping do qual o cinema fará parte:");
    createCinemaDto.shoppingName = reader.readLine();

    var cinema = cinemaService.create(createCinemaDto);
    cinema.toString();
    reader.readLine();

    return new ControllerContextDto("", RouteAction.CHANGE);
  }

  @Override
  public ControllerContextDto run() throws Exception {
    var ctx = internalRun();
    reader.end();

    return ctx;
  }

}
