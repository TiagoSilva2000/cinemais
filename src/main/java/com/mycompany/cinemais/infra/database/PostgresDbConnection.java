package com.mycompany.cinemais.infra.database;

import com.mycompany.cinemais.domain.infra.database.IDbConnection;

public class PostgresDbConnection implements IDbConnection {
  private String _server;
  private String _username;
  private String _password;
  private String _database;

  public PostgresDbConnection(
      String server,
      String username,
      String password,
      String database) {
    _server = server;
    _username = username;
    _password = password;
    _database = database;
  }

  @Override
  public void connect() {
    // TODO Auto-generated method stub

  }

  @Override
  public void close() {
    // TODO Auto-generated method stub

  }

}
