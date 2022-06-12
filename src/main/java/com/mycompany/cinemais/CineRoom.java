
package com.mycompany.cinemais;
import java.util.*;
import com.google.common.primitives.Ints;
/**
 *
 * @author blueevee
 */
public class CineRoom {
    private Integer capacity;
    private CineRoomType type;
    private String equipmentsDescription;
    private List<Session> sessions = new ArrayList<Session>();

    public CineRoom(Integer capacity, CineRoomType type, String equipmentsDescription) {
        this.capacity = capacity;
        this.type = type;
        this.equipmentsDescription = equipmentsDescription;
    }

    public void SetCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public Integer GetCapacity() {
        return this.capacity;
    }
    public void SetType(CineRoomType type) {
        this.type = type;
    }
    public CineRoomType GetType() {
        return this.type;
    }
    public void SetEquipmentsDescription(String equipmentsDescription) {
        this.equipmentsDescription = equipmentsDescription;
    }
    public String GetEquipmentsDescription() {
        return this.equipmentsDescription;
    }
    public void addSession(Session session) {
        this.sessions.add(Session session);
    }
    public void removeSession(Session session) {
        int index = Ints.indexOf(this.sessions, session);
        this.sessions.remove(index);
    }
  
}
