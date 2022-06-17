package com.mycompany.cinemais.domain.cineroom.repositories;

import com.mycompany.cinemais.domain.cineroom.entities.CineRoom;

public interface ICineRoomRepository {
  public CineRoom create(CineRoom cineRoom);

  public CineRoom read();

  public CineRoom update();

  public boolean delete();
}
