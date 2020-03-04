package Exercice1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener {
    private int saveX;
    private int saveY;
    private Graphics2D graphics;
    private int nb_click;
    
    
    public DrawPanel(int width, int height) {
        super();
        this.setPreferredSize (new Dimension(width, height)) ;
        this.setBorder (BorderFactory.createLineBorder (Color.black, 5)) ;
        saveX = 0;
        saveY = 0;
        nb_click = 0;
        addMouseListener(this);
        this.setBackground(Color.white);
    }
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        graphics = (Graphics2D) g.create();       
        graphics.setStroke (new BasicStroke (2)) ;
        graphics.setColor(Color.black);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (nb_click % 2 == 0) {
            saveX = me.getX();
            saveY = me.getY();
        }
        else {
            System.out.println(saveX + " ; " + saveY + " ; " + me.getX() + " ; " + me.getY());
            //graphics.drawLine(saveX,saveY, me.getX(), me.getY());
            graphics.draw(new Line2D.Double(saveX,saveY, me.getX(), me.getY()));
        }
        repaint();
        nb_click++;
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