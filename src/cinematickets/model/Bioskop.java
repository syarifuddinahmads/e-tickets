/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.model;

/**
 *
 * @author udin
 */
public class Bioskop {

    private Long id;
    private int idUser;
    private String roomName;
    private int roomNumber;
    private int status_Bioskop;

    public Bioskop(Long id, int idUser, String roomName, int roomNumber, int status_Bioskop) {
        this.id = id;
        this.idUser = idUser;
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.status_Bioskop = status_Bioskop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getStatus_Bioskop() {
        return status_Bioskop;
    }

    public void setStatus_Bioskop(int status_Bioskop) {
        this.status_Bioskop = status_Bioskop;
    }

    
}
