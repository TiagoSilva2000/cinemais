package com.mycompany.cinemais.domain.infra.database;

public interface IDbConnection {
  public void connect();

  public void close();
}
