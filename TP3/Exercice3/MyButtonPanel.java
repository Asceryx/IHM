package Exercice3;


import Exercice2.MyPanel;
import Exercice2.MyButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MyButtonPanel extends MyPanel implements ActionListener{
    
    public MyButtonPanel(int nblines, int ncolumns) {
        super(nblines, ncolumns);
        
        for (int i = 0; i<nblines; i++)
        {
            for (int j = 0 ; j<ncolumns; j++)
            {
                MyButton button = super.getButton(i, j);
                button.addActionListener(this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        MyButton buttonClicked = (MyButton)evt.getSource();
        JOptionPane.showInternalMessageDialog(null, 
                buttonClicked.getLine() + " - " + buttonClicked.getColumn(),
                "Ligne/Colonne", 
                JOptionPane.INFORMATION_MESSAGE);    
        
    }
}