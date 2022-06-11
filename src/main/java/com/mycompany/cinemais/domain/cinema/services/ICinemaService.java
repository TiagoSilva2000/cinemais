package com.mycompany.cinemais.domain.cinema.services;

import com.mycompany.cinemais.domain.cinema.dtos.CreateCinemaDto;
import com.mycompany.cinemais.domain.cinema.entities.Cinema;

public interface ICinemaService {
  public Cinema create(CreateCinemaDto request);

  public Cinema read();

  public Cinema update();

  public boolean delete();
}
