package Exercice2;


import Exercice2.MyPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanelTest extends JFrame implements ActionListener{
    private MyPanel p;
    private JButton quit;
    
    public MyPanelTest(String titre) {
        super(titre);
        p = new MyPanel(5,5);
        quit = new JButton("Quit");
        quit.addActionListener(this);
        this.add(p,BorderLayout.NORTH);
        JPanel bottom = new JPanel();
        this.add(bottom,BorderLayout.SOUTH);
        bottom.add(quit);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource () == quit) {
            this.dispose();
        }
    }
    
    
    public static void main (String [] args) {
        MyPanelTest frame = new MyPanelTest("Fenêtre 1");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}