
package com.mycompany.cinemais;

/**
 *
 * @author blueevee
 */
public class Session {
    private String begin;
    private Movie movie;
    private CineRoom cineRoom;
    private Integer currentCapacity;
    private Ticket[] tickets;


    public Session(String begin, Movie movie, CineRoom cineRoom, Integer currentCapacity, Ticket[] tickets) {
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
    public void SetTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
    public Ticket[] GetTickets() {
        return this.tickets;
    }
  
}
