/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.interfaces;

import cinematickets.model.FoodAndBeverage;

/**
 *
 * @author udin
 */
public interface FoodAndBeverageInterface {
    public FoodAndBeverage createFilm(FoodAndBeverage foodAndBeverage);

    public FoodAndBeverage editFilm(FoodAndBeverage foodAndBeverage);

    public FoodAndBeverage deleteFilm(FoodAndBeverage foodAndBeverage);

    public FoodAndBeverage updateFilm(FoodAndBeverage foodAndBeverage);

    public FoodAndBeverage searchFilm(FoodAndBeverage foodAndBeverage);
}
