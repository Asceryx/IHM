package Exercice1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Draw extends JFrame {
    
    public Draw (String title) {
        super(title);
        this.setLayout(new BorderLayout());
        
        JButton quit = new JButton("Quit");
        JButton wipe = new JButton("wipe");
        DrawPanel d = new DrawPanel(500,500);
        this.add(d,  BorderLayout.CENTER);       
        this.add(quit, BorderLayout.SOUTH);
        this.add(wipe, BorderLayout.EAST);
        
    }
    
    
    public static void main (String [] args){
        Draw frame = new Draw("Drawing Line");
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack() ;
        frame.setVisible(true);
    }
    
}