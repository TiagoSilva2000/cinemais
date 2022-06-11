package com.mycompany.cinemais.api.app;

import com.mycompany.cinemais.api.controllers.IController;
import com.mycompany.cinemais.app.common.dtos.ControllerContextDto;
import com.mycompany.cinemais.app.common.enums.RouteAction;
import com.mycompany.cinemais.domain.helpers.IRouter;

public class ConsoleRouter implements IRouter {
  private IController _currentDisplay = null;
  private IRouteMapper _routeMapper = new CinemaisRouteMapper();

  @Override
  public void startRouting() throws Exception {
    var context = new ControllerContextDto(
        "GET /",
        RouteAction.CHANGE);

    while (true) {
      if (context.routeAction == RouteAction.TERMINATE)
        break;
      else if (context.routeAction == RouteAction.CHANGE) {
        _currentDisplay = _routeMapper.Map(context.routeName);
        context = _currentDisplay.run();
      }
    }
  }

}
