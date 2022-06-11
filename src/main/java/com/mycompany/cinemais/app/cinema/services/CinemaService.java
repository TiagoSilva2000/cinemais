package com.mycompany.cinemais.app.cinema.services;

import java.util.UUID;
import com.mycompany.cinemais.domain.cinema.dtos.CreateCinemaDto;
import com.mycompany.cinemais.domain.cinema.entities.Cinema;
import com.mycompany.cinemais.domain.cinema.repositories.ICinemaRepository;
import com.mycompany.cinemais.domain.cinema.services.ICinemaService;
import com.mycompany.cinemais.infra.database.cinema.repositories.CinemaRepository;

public class CinemaService implements ICinemaService {
  private ICinemaRepository _cinemaRepository;

  public CinemaService() {
    _cinemaRepository = new CinemaRepository();
  }

  public CinemaService(ICinemaRepository cinemaRepository) {
    _cinemaRepository = cinemaRepository;
  }

  @Override
  public Cinema create(CreateCinemaDto request) {
    return _cinemaRepository.create(
        new Cinema(UUID.randomUUID(), request.shoppingName));
  }

  @Override
  public Cinema read() {
    return new Cinema(UUID.randomUUID(), "");
  }

  @Override
  public Cinema update() {
    return new Cinema(UUID.randomUUID(), "");
  }

  @Override
  public boolean delete() {
    return true;
  }
}
