package Exercice5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class MyLabelMouse extends JLabel implements MouseListener{
    private Color colorLabel;
    private Color colorText;
    
    private Font font;
    
    public MyLabelMouse (String text ,Color background, Color foreground){
        super(text);
        font = new Font("Book Antiqua", Font.PLAIN, 60);
        
        this.colorLabel = background;
        this.colorText = foreground;
        
        this.setFont(font);
        this.setOpaque(true);
        this.setBackground(colorLabel);
        this.setForeground(colorText);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Color tmp = colorLabel;
        colorLabel = colorText;
        colorText = tmp;
        
        this.setBackground(colorLabel);
        this.setForeground(colorText);
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}