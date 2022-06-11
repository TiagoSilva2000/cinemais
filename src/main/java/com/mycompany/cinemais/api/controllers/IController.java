package com.mycompany.cinemais.api.controllers;

import com.mycompany.cinemais.app.common.dtos.ControllerContextDto;

public interface IController {
  public ControllerContextDto run() throws Exception;
}
