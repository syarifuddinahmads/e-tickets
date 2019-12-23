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
public class Film {
    private Long id;
    private String title;
    private String description;
    private String image;
    private int statusFilm;
    private int idUser;

    public Film(Long id, String title, String description, String image, int statusFilm, int idUser) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.statusFilm = statusFilm;
        this.idUser = idUser;
    }

    public Long getId() {
        return id;
    }

    public void setTilte(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public int getStatusFilm() {
        return statusFilm;
    }

    public void setStatusFilm(int statusFilm) {
        this.statusFilm = statusFilm;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
