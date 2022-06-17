package com.mycompany.cinemais.domain.session.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

import com.mycompany.cinemais.domain.cineroom.entities.CineRoom;
import com.mycompany.cinemais.domain.common.services.ICacheService;
import com.mycompany.cinemais.domain.common.services.INotificationService;
import com.mycompany.cinemais.domain.movie.entities.Movie;
import com.mycompany.cinemais.domain.session.strategies.IPriceStrategy;
import com.mycompany.cinemais.domain.ticket.entities.Ticket;

public class Session {
  private final UUID id;
  private final Date begin;
  private final Movie movie;
  private final CineRoom cineRoom;
  private final Integer currentCapacity;
  private final ArrayList<Ticket> tickets = new ArrayList<Ticket>();

  private final IPriceStrategy priceStrategy;
  private final INotificationService notificationAdapter;
  private final ICacheService ticketCacheConnection;

  public Session(UUID id, Date begin, Movie movie, CineRoom cineRoom, Integer currentCapacity,
      IPriceStrategy priceStrategy, INotificationService notificationAdapter, ICacheService ticketCacheConnection) {
    this.id = id;
    this.begin = begin;
    this.movie = movie;
    this.cineRoom = cineRoom;
    this.currentCapacity = currentCapacity;
    this.priceStrategy = priceStrategy;
    this.notificationAdapter = notificationAdapter;
    this.ticketCacheConnection = ticketCacheConnection;
  }

  public void addTicket(Ticket ticket) {
    this.tickets.add(ticket);
  }

  public void removeTicket(Ticket ticket) {
    this.tickets.remove(ticket);
  }

  public UUID getId() {
    return id;
  }

  public Date getBegin() {
    return begin;
  }

  public Movie getMovie() {
    return movie;
  }

  public CineRoom getCineRoom() {
    return cineRoom;
  }

  public Integer getCurrentCapacity() {
    return currentCapacity;
  }

  public ArrayList<Ticket> getTickets() {
    return tickets;
  }

  public IPriceStrategy getPriceStrategy() {
    return priceStrategy;
  }

  public INotificationService getNotificationAdapter() {
    return notificationAdapter;
  }

  public ICacheService getTicketCacheConnection() {
    return ticketCacheConnection;
  }
}