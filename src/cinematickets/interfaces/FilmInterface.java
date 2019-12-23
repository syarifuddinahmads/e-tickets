/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.interfaces;

import cinematickets.model.Film;

/**
 *
 * @author udin
 */
public interface FilmInterface {
    public Film createFilm(Film film);

    public Film editFilm(Film film);

    public Film deleteFilm(Film film);

    public Film updateFilm(Film film);

    public Film searchFilm(Film film);
}