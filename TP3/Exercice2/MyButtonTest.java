package Exercice2;


import Exercice2.MyButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyButtonTest extends JFrame  implements ActionListener {
    private MyButton button;
    private JLabel label;
    private JButton quit;
    
    public MyButtonTest(int line, int column) {
        super("MyButtonTest");
        button = new MyButton(line,column);
        button.addActionListener(this);
        
        quit = new JButton("Quit");
        quit.addActionListener(this);
        label = new JLabel("Test");
        JPanel panel = new JPanel();
        this.add(panel, BorderLayout.CENTER);
        panel.add(button);
        panel.add(label);
        panel.add(quit); 
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource () == quit) {
            this.dispose();
        }
        this.displayLabel();
    }
    
    private void displayLabel () {
        int somme = button.getLine() + button.getColumn(); 
        label.setText ("" + somme) ;
    }
    
    public static void main (String [] args) {
        MyButtonTest frame = new MyButtonTest(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
  }
}