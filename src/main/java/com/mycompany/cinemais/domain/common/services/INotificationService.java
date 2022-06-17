package com.mycompany.cinemais.domain.common.services;

public interface INotificationService {
  public void Send(String address, String code);

  public boolean Verify(String code, String address);
}
