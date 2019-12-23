/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.interfaces;

import cinematickets.model.Bioskop;

/**
 *
 * @author udin
 */
public interface BioskopInterface {

    public Bioskop createBioskop(Bioskop bioskop);

    public Bioskop editBioskop(Bioskop bioskop);

    public Bioskop deleteBioskop(Bioskop bioskop);

    public Bioskop updateBioskop(Bioskop bioskop);

    public Bioskop searchBioskop(Bioskop bioskop);
}
