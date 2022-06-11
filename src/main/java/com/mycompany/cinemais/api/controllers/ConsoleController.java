package com.mycompany.cinemais.api.controllers;

import com.mycompany.cinemais.domain.helpers.IReader;

public abstract class ConsoleController implements IController {
  protected IReader reader;

  public ConsoleController(
      IReader reader) {
    this.reader = reader;
  }

}
