package Exercice3;


import Exercice3.MyButtonPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyButtonPanelTest extends JFrame implements ActionListener{

    private MyButtonPanel p;
    private JButton quit;
    
    public MyButtonPanelTest(String titre) {
        super(titre);
        p = new MyButtonPanel(5,5);
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
        MyButtonPanelTest frame = new MyButtonPanelTest("Fenêtre 1");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    