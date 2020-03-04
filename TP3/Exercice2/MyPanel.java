package Exercice2;


import Exercice2.MyButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    private List<List<MyButton>> BList; 
    
    public MyPanel(int nblines, int ncolumns) {
        this.setLayout(new GridLayout(nblines,ncolumns));
        BList = new ArrayList<List<MyButton>>();
        for (int i = 1; i<=nblines; i++)
        {
            List<MyButton> tmp = new ArrayList<MyButton>();
            for (int j = 1; j<=ncolumns; j++)
            {
               MyButton bnew = new MyButton(i,j);
               this.add(bnew); 
               tmp.add(bnew);
            }
            BList.add(tmp);
        }
    }
    
    public MyButton getButton(int line, int  column) {
        return this.BList.get(line).get(column);
    }
    
}