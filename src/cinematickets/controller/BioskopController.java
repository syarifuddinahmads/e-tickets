/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.controller;

import cinematickets.model.Bioskop;
import cinematickets.services.BioskopService;

/**
 *
 * @author udin
 */
public class BioskopController  extends MainController{
    
    BioskopService bioskopService = new BioskopService();
    
    public Bioskop createBioskop(Bioskop bioskop){
        return (Bioskop) bioskopService.create(bioskop);
    }
    
}
