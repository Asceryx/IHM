package Exercice4;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import jbutton.ButtonIcon;
import jbutton.ButtonStartPause;

import static jbutton.ButtonIcon.PAUSE;
import static jbutton.ButtonIcon.START;



public class ButtonIconTest extends JFrame implements ActionListener{
    ButtonStartPause bplay;
    ButtonStartPause bplay2;
    
    public ButtonIconTest(String titre) {
        super(titre);
        JPanel p = new JPanel();
        bplay = new ButtonStartPause(40);
        bplay2 = new ButtonStartPause(100);
        bplay.addActionListener(this);
        JPanel center = new JPanel(new BorderLayout());
        p.add(center);
        JPanel south = new JPanel(new BorderLayout());
        p.add(south);
        center.add(bplay, BorderLayout.CENTER);
        south.add(bplay2, BorderLayout.NORTH);
        this.add(p);

    }
    
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        /*
        if (evt.getSource () == bplay) {
            JButton buttonplay = (JButton)evt.getSource();
            if (buttonplay.getIcon() == B1)
            {
                buttonplay.setIcon(B2);
            }
            else
            {
                buttonplay.setIcon(B1);
            }
        }
        */
    }
    
    public static void main (String [] args) {
        ButtonIconTest frame = new ButtonIconTest("Player");
        
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
    }
}