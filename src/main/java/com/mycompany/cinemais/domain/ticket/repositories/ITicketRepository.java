package com.mycompany.cinemais.domain.ticket.repositories;

import com.mycompany.cinemais.domain.ticket.entities.Ticket;

public interface ITicketRepository {
  public Ticket create(Ticket ticket);

  public Ticket read();

  public Ticket update();

  public boolean delete();
}
