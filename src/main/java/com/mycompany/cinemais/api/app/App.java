package com.mycompany.cinemais.api.app;

import com.mycompany.cinemais.domain.helpers.IRouter;
import com.mycompany.cinemais.domain.infra.database.IDbConnection;

public abstract class App {
  protected IRouter _router;
  protected IDbConnection _db;

  public App(
      IRouter router,
      IDbConnection db) {
    _router = router;
    _db = db;
  }

  public abstract void run() throws Exception;

  public abstract void finish() throws Exception;
}
