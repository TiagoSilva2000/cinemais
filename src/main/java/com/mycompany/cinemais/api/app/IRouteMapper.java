package com.mycompany.cinemais.api.app;

import com.mycompany.cinemais.api.controllers.IController;

public interface IRouteMapper {
  public IController Map(String route) throws Exception;
}
