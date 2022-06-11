package com.mycompany.cinemais.domain.cinema.repositories;

import com.mycompany.cinemais.domain.cinema.entities.Cinema;

public interface ICinemaRepository {
  public Cinema create(Cinema cinema);

  public Cinema read();

  public Cinema update();

  public boolean delete();
}
