package com.mycompany.cinemais.domain.ticket.services;

import com.mycompany.cinemais.domain.ticket.entities.Ticket;

public interface ITicketService {
  public Ticket create(Ticket ticket);

  public Ticket read();

  public Ticket update();

  public boolean delete();
}
