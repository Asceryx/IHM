package Exercice1;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class KeyeventFrame extends JFrame implements KeyListener, ActionListener{
    private JButton quitButton ;
    private KeyeventPanel ePanel;
    
    
    public KeyeventFrame(String title){
        super(title);
        ePanel = new KeyeventPanel();
        quitButton = new JButton("Quit");
        quitButton.addActionListener(this); 
        this.add(quitButton,BorderLayout.SOUTH);
        this.add(ePanel,BorderLayout.CENTER);
        addKeyListener(this);
        
        
    }
    
     public static void main (String [] args) {
        KeyeventFrame frame = new KeyeventFrame("Ersatz de Xev");
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack() ;
        frame.setVisible(true);
        frame.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == quitButton)
        {
            this.dispose();
        }
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        ePanel.setText(ke);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
     
     
    
}