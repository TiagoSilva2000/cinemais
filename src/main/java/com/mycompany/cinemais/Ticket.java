
package com.mycompany.cinemais;
/**
 *
 * @author blueevee
 */
public class Ticket {
    private String customerName;
    private String customerDocument;
    private Session session;
    private double price;
    private String boughtAt;

    public Ticket(String customerName, String customerDocument, Session session, double price, String boughtAt) {
        this.customerName = customerName;
        this.customerDocument = customerDocument;
        this.session = session;
        this.price = price;
        this.boughtAt = boughtAt;
    }

    public void SetCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String GetCustomerName() {
        return this.customerName;
    }
    public void SetCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }
    public String GetCustomerDocument() {
        return this.customerDocument;
    }
    public void SetSession(Session session) {
        this.session = session;
    }
    public Session GetSession() {
        return this.session;
    }
    public void SetPrice(double price) {
        this.price = price;
    }
    public double GetPrice() {
        return this.price;
    }
    public void SetBoughtAt(String boughtAt) {
        this.boughtAt = boughtAt;
    }
    public String GetBoughtAt() {
        return this.boughtAt;
    }
  
}
