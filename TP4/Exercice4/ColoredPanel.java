package Exercice4;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ColoredPanel extends JPanel {
    JPanel panelblue;
    JPanel panelcyan;
    JPanel panelgreen;
    
    public ColoredPanel()
    {
        panelblue = new JPanel();
        panelcyan = new JPanel();
        panelgreen = new JPanel();
        this.setLayout(new OverlayLayout(this));
        this.add(panelblue);
        panelblue.setBackground(Color.blue);
        panelblue.setSize(new Dimension(100, 100));
        
        this.add(panelcyan);
        panelcyan.setBackground(Color.cyan);
        panelblue.setSize(new Dimension(200, 400));
    }   
    
    public static void main (String [] args) {
        JFrame frame = new JFrame("Colored panel");
        ColoredPanel main = new ColoredPanel();
        frame.add(main);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}