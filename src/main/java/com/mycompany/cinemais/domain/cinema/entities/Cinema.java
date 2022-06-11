package com.mycompany.cinemais.domain.cinema.entities;

import java.util.UUID;

public class Cinema {
  private final UUID id;
  private final String shoppingName;

  public Cinema(UUID id, String shoppingName) {
    this.id = id;
    this.shoppingName = shoppingName;
  }

  public String getShoppingName() {
    return shoppingName;
  }

  public UUID getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Cinema [id=" + id + ", shoppingName=" + shoppingName + "]";
  }

}
