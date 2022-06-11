package com.mycompany.cinemais.infra.database.cinema.repositories;

import java.util.UUID;

import com.mycompany.cinemais.domain.cinema.entities.Cinema;
import com.mycompany.cinemais.domain.cinema.repositories.ICinemaRepository;
import com.mycompany.cinemais.domain.infra.database.PostgresDbConnection;

public class CinemaRepository implements ICinemaRepository {

  @Override
  public Cinema create(Cinema cinema) {
    var connection = PostgresDbConnection.getConnection();
    return new Cinema(UUID.randomUUID(), "");
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
