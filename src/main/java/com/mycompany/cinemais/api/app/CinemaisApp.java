package com.mycompany.cinemais.api.app;

import com.mycompany.cinemais.domain.helpers.IRouter;
import com.mycompany.cinemais.domain.infra.database.IDbConnection;

public class CinemaisApp extends App {
  public CinemaisApp(
      IRouter router,
      IDbConnection db) {
    super(router, db);
  }

  @Override
  public void run() throws Exception {
    _router.startRouting();
  }

  @Override
  public void finish() throws Exception {
    _db.close();

    System.out.println("\n\nFinalizando funcionamento da aplicação...");
  }

}
