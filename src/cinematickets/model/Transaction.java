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
public class Transaction {
    private Long id;
    private int idCustomer;
    private int idFilm;
    private int idBioskop;
    private int idUser;
    private Double totalPrice;

    public Transaction(Long id, int idCustomer, int idFilm, int idBioskop, int idUser, Double totalPrice) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idFilm = idFilm;
        this.idBioskop = idBioskop;
        this.idUser = idUser;
        this.totalPrice = totalPrice;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getIdBioskop() {
        return idBioskop;
    }

    public void setIdBioskop(int idBioskop) {
        this.idBioskop = idBioskop;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
