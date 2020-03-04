package Exercice1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrameMouseMotion extends JFrame implements MouseMotionListener{
    private JLabel coordonate;
    private JLabel label; 
    
    public MyFrameMouseMotion(String title)
    {
        label = new JLabel("Hello");
        coordonate = new JLabel("Position");
        Box box = Box.createVerticalBox();
        
        JPanel panel = new JPanel(new BorderLayout());
        label.setFont(new Font("TimesRoman", Font.PLAIN, 75));
        panel.add(label,BorderLayout.NORTH); 
        panel.add(coordonate,BorderLayout.SOUTH);
        
        label.setOpaque(true);
        coordonate.setOpaque(true);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(label);
        coordonate.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(coordonate);
        
        panel.add(box);
        this.add(panel);
        label.addMouseMotionListener(this);
    }
    
    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        String str = me.getX() + " ; " + me.getY();
        int maxSizeW= label.getWidth();
        int maxSizeH= label.getHeight();
        if (0.2 * maxSizeW >= me.getX())
        {
            label.setBackground(Color.blue);
        }
        else if (maxSizeW - (0.2 * maxSizeW) <= me.getX()) 
        {
            label.setBackground(Color.red);
        }
        else
        {
            label.setBackground(Color.green);
        }
        
        
        if(0.2 * maxSizeH >= me.getY())
        {
            coordonate.setBackground(Color.blue);
        }
        
        else if (maxSizeH - (0.2 * maxSizeH) <= me.getY()) 
        {
            coordonate.setBackground(Color.red);
        }
        else
        {
            coordonate.setBackground(Color.green);
        }
        
        coordonate.setText(str);
    }
    
    public static void main (String [] args) {
        MyFrameMouseMotion frame = new MyFrameMouseMotion("Mouse motion");
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}