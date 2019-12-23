/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.interfaces;

import cinematickets.model.Showtime;

/**
 *
 * @author udin
 */
public interface ShowtimeInterface {
 
    public Showtime createShowtime(Showtime showtime);

    public Showtime editShowtime(Showtime showtime);

    public Showtime deleteShowtime(Showtime showtime);

    public Showtime updateShowtime(Showtime showtime);

    public Showtime searchShowtime(Showtime showtime);
    
}
