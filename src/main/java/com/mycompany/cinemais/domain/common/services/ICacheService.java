package com.mycompany.cinemais.domain.common.services;

public interface ICacheService {
  public <T> void set(String key, T value) throws Exception;

  public <T> T get(String key) throws Exception;
}
