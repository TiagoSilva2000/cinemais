
package com.mycompany.cinemais;
import java.util.*;
import com.google.common.primitives.Ints;
/**
 *
 * @author blueevee
 */
public class Session {
    private String begin;
    private Movie movie;
    private CineRoom cineRoom;
    private Integer currentCapacity;
    private List<Ticket> tickets = new ArrayList<Ticket>();
    import com.google.common.primitives.Ints;


    public Session(String begin, Movie movie, CineRoom cineRoom, Integer currentCapacity, c tickets) {
        this.begin = begin;
        this.movie = movie;
        this.cineRoom = cineRoom;
        this.currentCapacity = currentCapacity;
        this.tickets = tickets;
    }

    public void SetBegin(String begin) {
        this.begin = begin;
    }
    public String GetBegin() {
        return this.begin;
    }
    public void SetMovie(Movie movie) {
        this.movie = movie;
    }
    public Movie GetMovie() {
        return this.movie;
    }
    public void SetCineRoom(CineRoom cineRoom) {
        this.titccineRoomineRoomle = cineRoom;
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
    public void SetTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    public List<Ticket> GetTickets() {
        return this.tickets;
    }
    public void addTicket(Ticket ticket) {
        this.tickets.add(Ticket ticket);
    }
    public void removeTicket(Ticket ticket) {
        int index = Ints.indexOf(this.tickets, ticket);
        this.tickets.remove(index);
    }
  
}
