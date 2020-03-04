package Exercice1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame implements ActionListener {
    private JButton quitButton ;
    private JPanel south;
     
    
    public MyFrame(String title){
        super(title);
        quitButton = new JButton("Quit");
        south = new JPanel();
        south.setLayout(new BoxLayout(south, BoxLayout.LINE_AXIS));
        quitButton.addActionListener(this);
        south.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
        south.add(Box.createHorizontalGlue());
        south.add (quitButton);
        this.add(south, BorderLayout.SOUTH);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource () == quitButton) {
            this.dispose();
        }
    }
    
    public JButton getButton()
    {
        return quitButton;
    }
    
    
    public static void main (String [] args) {
        MyFrame frame = new MyFrame("Bouton quit");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }
    
}