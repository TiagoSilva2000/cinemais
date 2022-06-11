package com.mycompany.cinemais.domain.infra.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresDbConnection {
  private static PostgresDbConnection instance = new PostgresDbConnection();
  private static Connection connection;

  private PostgresDbConnection() {
    try {
      Class.forName("org.postgresql.Driver");
      connection = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/cinemais",
              "cinemais", "cinemais");
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }

  public static PostgresDbConnection getInstance() {
    return instance;
  }

  public static Connection getConnection() {
    return connection;
  }
}
