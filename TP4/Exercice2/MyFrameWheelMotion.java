package Exercice2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameWheelMotion extends JFrame implements MouseListener,  MouseWheelListener{
    private JLabel label;
    private Font font;
    private int size;

    
    public MyFrameWheelMotion(String title)
    {
        super (title);
        label = new JLabel("Molette :                        ");
        size = 12;
        font = new Font("TimesRoman", Font.PLAIN, size);
        label.setFont(font);
        this.add(label);
        label.addMouseWheelListener(this);
        label.addMouseListener(this);
    }
        
    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) 
    {
        int rotation =  mwe.getWheelRotation();
        size += rotation * 2;
        font = new Font("TimesRoman", Font.PLAIN, size);
        label.setFont(font);
        FontMetrics metrics = label.getFontMetrics(font);
        label.setText("Molette : " + rotation);
        int hgt = metrics.getHeight();
        int adv = metrics.stringWidth(label.getText());
        Dimension size = new Dimension(adv+50, hgt+50);
        this.setSize(size);
    }
    
    
    
    
    public static void main (String [] args) {
        MyFrameWheelMotion frame = new MyFrameWheelMotion("Mouse wheel motion");
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource() == label)
        {
            this.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
    
}