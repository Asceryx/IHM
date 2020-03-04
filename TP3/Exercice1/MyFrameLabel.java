package Exercice1;


import Exercice1.MyFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrameLabel extends MyFrame {
    private JLabel label;
    private JPanel center;
    
    public MyFrameLabel(String title){
        super(title);
        label = new JLabel(title);
        center = new JPanel();
        this.add(center, BorderLayout.CENTER);
        center.add(label);
    }
    
    public static void run(MyFrame f){
        f.setSize(500, 200);
        f.setDefaultCloseOperation (EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static void main (String [] args) {
        MyFrame frame = new MyFrameLabel("Fenêtre 1");
        MyFrame frame2 = new MyFrameLabel("Fenêtre 2");
        
        MyFrameLabel.run(frame);
        MyFrameLabel.run(frame2);
    }
}