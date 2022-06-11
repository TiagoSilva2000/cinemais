package com.mycompany.cinemais.app.common.dtos;

import com.mycompany.cinemais.app.common.enums.RouteAction;

public class ControllerContextDto {
  public String routeName;
  public RouteAction routeAction;

  public ControllerContextDto(
      RouteAction routeAction) {
    this.routeAction = routeAction;
  }

  public ControllerContextDto(
      String routeName,
      RouteAction routeAction) {
    this.routeAction = routeAction;
    this.routeName = routeName;
  }

  public RouteAction getRouteAction() {
    return routeAction;
  }

  public String getRouteName() {
    return routeName;
  }

}
