/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

/**
 *
 * @author Yosua
 */
public class Welcome extends JFrame{
    private JButton login = new JButton("LOGIN");
    private JButton listMovie = new JButton("SEDANG TAYANG");
//    private JButton Pesan = new JButton("PESAN TIKET");
    private Border border = BorderFactory.createLineBorder(Color.BLACK);
    public Welcome(){
        
        
        this.login.setBounds(150, 300, 200, 50);
        Color colorLogin = new Color(234, 76, 137);
        this.login.setBackground(colorLogin);
        this.login.setBorder(this.border);
        this.login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LoginView2 login = new LoginView2();
            }
        });
        add(this.login);
        
        this.listMovie.setBounds(150, 400, 200, 50);
        Color colorList = new Color(255, 77, 96);
        this.listMovie.setBackground(colorList);
        this.listMovie.setBorder(border);
        add(this.listMovie);
        
//        this.Pesan.setBounds(150, 500, 200, 50);
//        Color colorPesan = new Color(5, 79, 190);
//        this.Pesan.setBackground(colorPesan);
//        this.Pesan.setBorder(border);
//        add(this.Pesan);
        
        setTitle("Cinema Tickets");
        setSize(500, 700);
        setLayout(null);
        Color colorFrame = new Color(245, 235, 201);
        getContentPane().setBackground(colorFrame);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
