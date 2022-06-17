package com.mycompany.cinemais.domain.cineroom.entities;

import java.util.UUID;

import com.mycompany.cinemais.domain.cineroom.enums.CineRoomType;

public class CineRoom {
  private final UUID id;
  private final Integer maxCapacity;
  private final CineRoomType type;
  private final String equipmentsDescription;

  public CineRoom(UUID id, Integer maxCapacity, CineRoomType type, String equipmentsDescription) {
    this.id = id;
    this.maxCapacity = maxCapacity;
    this.type = type;
    this.equipmentsDescription = equipmentsDescription;
  }

  public UUID getId() {
    return id;
  }

  public Integer getMaxCapacity() {
    return maxCapacity;
  }

  public CineRoomType getType() {
    return type;
  }

  public String getEquipmentsDescription() {
    return equipmentsDescription;
  }
}
