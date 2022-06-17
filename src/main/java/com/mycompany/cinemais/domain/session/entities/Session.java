package com.mycompany.cinemais.domain.session.entities;

import java.util.UUID;

public class Session {
  private final UUID id;
  private final Date begin;
  private final Movie movie;
  private final CineRoom cineRoom;
  private final Integer currentCapacity;
  private final ArrayList<Ticket> tickets = new ArrayList<Ticket>();
  private final IPriceStrategy priceStrategy;
  private final INotificationAdapter notificationAdapter;
  private final ICache ticketCacheConnection;

    public Session(Date begin, Movie movie, CineRoom cineRoom) {
        this.begin = begin;
        this.movie = movie;
        this.cineRoom = cineRoom;
    }

    public void SetBegin(Date begin) {
        this.begin = begin;
    }
    public Date GetBegin() {
        return this.begin;
    }
    public void SetMovie(Movie movie) {
        this.movie = movie;
    }
    public Movie GetMovie() {
        return this.movie;
    }
    public void SetCineRoom(CineRoom cineRoom) {
        this.cineRoom = cineRoom;
    }
    public CineRoom GetCineRoom() {
        return this.cineRoom;
    }
    public void SetCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
    public Integer GetCurrentCapacity() {
        return this.currentCapacity;
    }
    public void addTicket(Ticket ticket) {
        this.tickets.add(Ticket ticket);
    }
    public void removeTicket(Ticket ticket) {
        int index = Ints.indexOf(this.tickets, ticket);
        this.tickets.remove(index);
    }
}