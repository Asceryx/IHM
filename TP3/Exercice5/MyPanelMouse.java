package Exercice5;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class MyPanelMouse extends JPanel implements MouseListener{
    private Color current;
    private Color save;
    
    public MyPanelMouse(Color background, Color changebackground)
    {
        this.current = background;
        this.save = changebackground;
        this.setBackground(current);
        addMouseListener(this);
        
    }
    
    @Override       
    public void mouseClicked (MouseEvent event) { 
        Color tmp = current;
        current = save;
        save =tmp;
        
        this.setBackground(current);
    }

    @Override
    public void mousePressed (MouseEvent event) {
    }
    
    @Override
    public void mouseReleased (MouseEvent event) {
    }

    @Override
    public void mouseEntered (MouseEvent event) {
    }

    @Override
    public void mouseExited (MouseEvent event) {
    }
    
}