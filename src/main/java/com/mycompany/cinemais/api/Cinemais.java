package com.mycompany.cinemais.api;

import com.mycompany.cinemais.api.app.App;
import com.mycompany.cinemais.api.app.CinemaisApp;
import com.mycompany.cinemais.api.app.ConsoleRouter;
import com.mycompany.cinemais.domain.helpers.IRouter;
import com.mycompany.cinemais.domain.infra.database.IDbConnection;
import com.mycompany.cinemais.infra.database.PostgresDbConnection;

public class Cinemais {
  public static void main(String[] args) throws Exception {
    IDbConnection db = new PostgresDbConnection("localhost", "postgres", "postgres", "cinemais");
    IRouter router = new ConsoleRouter();
    App app = new CinemaisApp(router, db);

    System.out.println("Starting app...");
    app.run();
    app.finish();
  }
}
