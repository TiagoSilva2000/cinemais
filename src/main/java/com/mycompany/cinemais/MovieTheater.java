
package com.mycompany.cinemais;
import java.util.*;
import com.google.common.primitives.Ints;
/**
 *
 * @author blueevee
 */
public class MovieTheater {
    private String mall;
    private List<CineRoom> cineRooms = new ArrayList<CineRoom>();

    public MovieTheater(String mall) {
        this.mall = mall;
    }

    public void SetMall(String mall) {
        this.mall = mall;
    }
    public String GeMall() {
        return this.mall;
    }
    public void addRoom(CineRoom cineRoom) {
        this.sessions.add(CineRoom cineRoom);
    }
  
}
