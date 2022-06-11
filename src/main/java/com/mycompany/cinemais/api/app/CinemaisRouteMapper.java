package com.mycompany.cinemais.api.app;

import java.util.HashMap;

import com.mycompany.cinemais.api.controllers.IController;
import com.mycompany.cinemais.api.controllers.MainIndexController;
import com.mycompany.cinemais.app.helpers.ScannerReader;

public class CinemaisRouteMapper implements IRouteMapper {
  private HashMap<String, IController> routes;

  public CinemaisRouteMapper() {
    this.routes = new HashMap<String, IController>();
    routes.put("GET /", new MainIndexController(new ScannerReader()));
    routes.put("PUT /cinema", new MainIndexController(new ScannerReader()));
  }

  @Override
  public IController Map(String route) throws Exception {
    try {
      var controller = routes.get(route);

      if (controller.equals(null)) {
        throw new Exception();
      }

      return controller;
    } catch (Exception e) {
      throw new Exception(String.format("Controller %s não encontrado", route));
    }
  }

}
