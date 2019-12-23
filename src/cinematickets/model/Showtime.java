/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.model;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author udin
 */
public class Showtime {

    private long id;
    private long idFilm;
    private String DateTimeShow;
    private int session;
    private long idBioskop;
    private long idUser;

    public Showtime(long id, long idFilm, String DateTimeShow, int session, long idBioskop, long idUser) {
        this.id = id;
        this.idFilm = idFilm;
        this.DateTimeShow = DateTimeShow;
        this.session = session;
        this.idBioskop = idBioskop;
        this.idUser = idUser;
    }

    public long getId() {
        return id;
    }

    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public String getDateTimeShow() {
        return DateTimeShow;
    }

    public void setDateTimeShow(String DateTimeShow) {
        this.DateTimeShow = DateTimeShow;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public long getIdBioskop() {
        return idBioskop;
    }

    public void setIdBioskop(long idBioskop) {
        this.idBioskop = idBioskop;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
}
