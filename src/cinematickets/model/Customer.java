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
public class Customer {
    private Long id;     
    private int idUser;
    private String fullname;
    private int noTelp;

    public Customer(Long id, int idUser, String fullname, int noTelp) {
        this.id = id;
        this.idUser = idUser;
        this.fullname = fullname;
        this.noTelp = noTelp;
    }
    
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }    
}
