package Exercice1;


import Exercice1.MyFrame;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;


public class MyFrameOption extends MyFrame {
    public MyFrameOption(String title) {
        super(title);
        new JOptionPane();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(this, "le message", 
                "le titre", JOptionPane.OK_CANCEL_OPTION);
        if (result == OK_OPTION) 
        {
            super.actionPerformed(evt);
        }
        
    }
    
    
    public static void main (String [] args) {
        MyFrameOption frame = new MyFrameOption("Fenêtre 1");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
}