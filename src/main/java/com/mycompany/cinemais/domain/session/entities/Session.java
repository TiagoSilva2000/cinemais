package com.mycompany.cinemais.domain.session.entities;

import java.util.UUID;

public class Session {
  private final UUID id;
  private final Date begin;
  private final Movie movie;
  private final CineRoom cineRoom;
  private final Integer currentCapacity;
  private final tickets: Ticket[]
//- priceStrategy: IPriceStrategy;
//- notificationAdapter: INotificationAdapter
//- ticketCacheConnection: ICache

  public Session() {
    this.id = id;
  }

}
