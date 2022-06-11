package com.mycompany.cinemais.app.helpers;

import java.util.Scanner;

import com.mycompany.cinemais.domain.helpers.IReader;

public class ScannerReader implements IReader {
  private Scanner _scanner;

  public ScannerReader() {
    _scanner = new Scanner(System.in);
  }

  public void end() throws Exception {
    _scanner.close();
  }

  @Override
  public String readLine() throws Exception {
    return _scanner.nextLine();
  }

  @Override
  public Integer readNumericOption() throws Exception {
    return _scanner.nextInt();
  }

}
