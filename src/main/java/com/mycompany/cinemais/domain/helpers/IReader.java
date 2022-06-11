package com.mycompany.cinemais.domain.helpers;

public interface IReader {

  public String readLine() throws Exception;

  public Integer readNumericOption() throws Exception;

  public void end() throws Exception;
}