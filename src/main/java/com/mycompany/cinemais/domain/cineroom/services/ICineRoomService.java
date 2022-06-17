package com.mycompany.cinemais.domain.cineroom.services;

import com.mycompany.cinemais.domain.cineroom.entities.CineRoom;

public interface ICineRoomService {
  public CineRoom create(CineRoom cineRoom);

  public CineRoom read();

  public CineRoom update();

  public boolean delete();
}
