package Exercice3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrameSpinnerFont extends JFrame implements MouseListener, ChangeListener{
    
    private JLabel label;
    private JSpinner spinner;
    private Font font;
    private int size;

    
    public MyFrameSpinnerFont(String title)
    {
        super (title);
        label = new JLabel("Spinner :                        ");
        size = 12;
        spinner = new JSpinner();
        spinner.setBounds(70, 70, 50, 40);
        spinner.setValue(size);
        font = new Font("TimesRoman", Font.PLAIN, size);
        label.setFont(font);
        JPanel p = new JPanel(new BorderLayout());
        
        
        p.add(label, BorderLayout.NORTH);
        p.add(spinner, BorderLayout.SOUTH);
        this.add(p);
        label.addMouseListener(this);
        spinner.addChangeListener(this);
    }
        
    public void mouseWheelMoved(MouseWheelEvent mwe) {}
    
    public static void main (String [] args) {
        MyFrameSpinnerFont frame = new MyFrameSpinnerFont("Mouse spinner motion");
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

    @Override
    public void stateChanged(ChangeEvent ce) {
        if(ce.getSource() == spinner)
        {
            size = (int) spinner.getValue();
            font = new Font("TimesRoman", Font.PLAIN, size);
            label.setFont(font);
            FontMetrics metrics = label.getFontMetrics(font);
            label.setText("Molette : " + size);
            int hgt = metrics.getHeight();
            int adv = metrics.stringWidth(label.getText());
            Dimension size = new Dimension(adv+50, hgt+50);
            this.setSize(size);
        }
    }

}
