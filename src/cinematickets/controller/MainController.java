/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.controller;

import cinematickets.view.LoginView;
import cinematickets.view.MainView;

/**
 *
 * @author udin
 */
public class MainController {

    public void loginView() {
        LoginView loginView = new LoginView();
    }
    
    public void mainView() {
        MainView mainView = new MainView();
    }

}
