package cinematickets.view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author yogi-06926
 */
public class FilmView2 extends Componnent {
    
    
    public FilmView2(){
        myPane.setBounds(0, 0, 950, 700);
        myPane.setForeground(new Color(75,0,250));
        myPane.setVisible(true);
        add(myPane);
        
        setTitle("Transaction View");
        setForeground(Color.blue);
        setSize(950,700);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
