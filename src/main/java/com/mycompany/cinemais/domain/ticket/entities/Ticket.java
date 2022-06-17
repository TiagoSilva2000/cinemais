package com.mycompany.cinemais.domain.ticket.entities;

import java.util.Date;
import java.util.UUID;

public class Ticket {
  private final UUID id;
  private final double price;
  private final Date boughtAt;
  private final String customerName;
  private final String customDocument;
  private final String customerEmail;
  private final String customerPhone;

  public Ticket(UUID id, double price, Date boughtAt, String customerName, String customDocument, String customerEmail,
      String customerPhone) {
    this.id = id;
    this.price = price;
    this.boughtAt = boughtAt;
    this.customerName = customerName;
    this.customDocument = customDocument;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;
  }

  public UUID getId() {
    return id;
  }

  public double getPrice() {
    return price;
  }

  public Date getBoughtAt() {
    return boughtAt;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomDocument() {
    return customDocument;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }
}