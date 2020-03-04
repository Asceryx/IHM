
package Exercice5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorMouse extends JFrame implements MouseListener{
    private MyPanelMouse p;
    private MyLabelMouse l;
    private MyLabelMouse l2;
    
    private Color colorPanel;
    private Color colorLabel;
    private Color colorText;
    
    private List<Color> currentsetofcolor;
    
    public ColorMouse(String title)
    {
        super(title);

        currentsetofcolor = new ArrayList<Color>(Arrays.asList(Color.blue, Color.green, Color.red));
     
        colorText = currentsetofcolor.get(0);
        colorLabel = currentsetofcolor.get(1);
        colorPanel = currentsetofcolor.get(2);
        
        l = new MyLabelMouse("Hello",colorLabel,colorText);
        l2 = new MyLabelMouse("World",Color.ORANGE,Color.MAGENTA);
        p = new MyPanelMouse(colorPanel, Color.cyan);
  
        p.add(l, BorderLayout.NORTH);
        p.add(l2, BorderLayout.SOUTH);
        this.add(p); 
        
    }
    
    @Override       
    public void mouseClicked (MouseEvent event) {
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
  
    public static void main (String [] args) {
        ColorMouse frame = new ColorMouse("Fenêtre 1");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}