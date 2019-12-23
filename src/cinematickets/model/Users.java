/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.model;

import java.util.Set;

/**
 *
 * @author udin
 */
public class Users {
    private Long id;
    private String fullname;
    private String username;
    private String password;
    private int typeUser;

    public Users(Long id, String fullname, String username, String password, int typeUser) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.typeUser = typeUser;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTypeUser(int typeUser) {
        this.typeUser = typeUser;
    }

    public int getTypeUser() {
        return typeUser;
    }

    
}
