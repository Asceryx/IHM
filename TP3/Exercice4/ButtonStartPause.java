package Exercice4;

import javax.swing.JButton;
import jbutton.ButtonIcon;
import static jbutton.ButtonIcon.START;

public class ButtonStartPause extends JButton {
    private ButtonIcon start;
    public ButtonStartPause(int size) 
    {
        start = new ButtonIcon(START, size, size);
        this.setIcon(start);
    }
}