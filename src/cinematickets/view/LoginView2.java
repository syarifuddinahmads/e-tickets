/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import sun.awt.RequestFocusController;

/**
 *
 * @author Yosua
 */
public class LoginView2 {
    private JFrame frame = new JFrame();
    private JTextField userName = new JTextField("User Name");
    private JPasswordField password = new JPasswordField("Password");
    private JButton login = new JButton("LOGIN");
    private JButton Cancel = new JButton("CANCEL");
    
    public LoginView2(){
        this.frame.setTitle("LOGIN");
        this.frame.dispose();
        
        Border border = new EmptyBorder(5, 15, 5, 15);
        this.userName.setFocusable(false);
        this.userName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                LoginView2.this.userName.setText("");
                LoginView2.this.userName.setFocusable(true);
            }
        });
        this.userName.setBounds(100, 250, 300, 40);
        this.userName.setBorder(border);
        this.frame.add(this.userName);
        
        this.password.setFocusable(false);
        this.password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                LoginView2.this.password.setText("");
                LoginView2.this.password.setFocusable(true);
            }
        });
        this.password.setBounds(100, 300, 300, 40);
        this.password.setBorder(border);
        this.frame.add(this.password);
        
        this.login.setBounds(170, 370, 150, 50);
        Border loginBorder = BorderFactory.createEtchedBorder(1);
        Color loginColor = new Color(234, 76, 137);
        this.login.setBorder(loginBorder);
        this.login.setBackground(loginColor);
        this.frame.add(this.login);
        
        this.Cancel.setBounds(170, 430, 150, 50);
        this.Cancel.setBorder(loginBorder);
        this.Cancel.setBackground(loginColor);
        this.Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LoginView2.this.frame.dispose();
            }
        });
        this.frame.add(this.Cancel);
        
        Color frameColor = new Color(245, 235, 201);
        this.frame.getContentPane().setBackground(frameColor);
        this.frame.setLayout(null);
        this.frame.setSize(500, 700);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
    }
}
