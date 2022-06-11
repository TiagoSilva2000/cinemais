package com.mycompany.cinemais.api.controllers;

import com.mycompany.cinemais.app.common.dtos.ControllerContextDto;
import com.mycompany.cinemais.app.common.enums.RouteAction;
import com.mycompany.cinemais.domain.helpers.IReader;

public class MainIndexController extends ConsoleController {

  public MainIndexController(IReader reader) {
    super(reader);
  }

  public void printScreen() {
    System.out.println("Olá! Você está operando o CineMais!\nEscolha a opção de acordo com a operação.");
    System.out.println("1 - Criar Cinema");
    System.out.println("0 - Sair");
  }

  private ControllerContextDto internalRun() throws Exception {
    printScreen();
    while (true) {
      try {
        var choice = reader.readNumericOption();

        switch (choice) {
          case 0:
            return new ControllerContextDto(RouteAction.TERMINATE);
          case 1:
            return new ControllerContextDto("PUT /cinema", RouteAction.CHANGE);
          default:
            throw new Exception("Escolha inválida");
        }

      } catch (Exception e) {
        System.out.println(e.getMessage());
        reader.readLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        printScreen();
      }
    }
  }

  @Override
  public ControllerContextDto run() throws Exception {
    var context = internalRun();
    reader.end();

    return context;
  }

}
