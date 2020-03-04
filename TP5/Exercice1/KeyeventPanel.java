package Exercice1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.getKeyText;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyeventPanel extends JPanel {
    private Box text_box;
    private JPanel key_control;
    private JLabel keycode;
    private JLabel keychar;
    private JLabel mnemo;
    private JLabel location;
    
    public KeyeventPanel () {
        super (new BorderLayout());
        text_box = new Box(BoxLayout.PAGE_AXIS);
        
        key_control = new JPanel();
        key_control.setPreferredSize( new Dimension(100, 150 ));
        
        keycode = new JLabel("Keycode: ");
        keychar = new JLabel("Keychar: ");
        mnemo = new JLabel("Mnemonic: ");
        location = new JLabel("Location: ");
        
        text_box.add(key_control);
        text_box.add(keycode);
        text_box.add(keychar);
        text_box.add(mnemo);
        text_box.add(location);
        key_control.setBorder (BorderFactory.createLineBorder (Color.black, 1));
        this.add(text_box, BorderLayout.NORTH);
        this.add(key_control,  BorderLayout.CENTER);         
    }
   
    public void setText(KeyEvent ke) {
        this.keycode.setText("Keycode: " + ke.getKeyCode());
        this.keychar.setText("Keychar: " + ke.getKeyChar());
        this.mnemo.setText("Mnemonic: " + getKeyText(ke.getKeyCode()));
        this.location.setText("Location: " + ke.getKeyLocation());
    }
}