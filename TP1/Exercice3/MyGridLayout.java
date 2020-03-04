package Exercice3;

import java.awt.Color ;
import java.awt.ComponentOrientation;

import java.awt.GridLayout;
    
import javax.swing.JFrame ;
import javax.swing.JButton ;
import javax.swing.BorderFactory ;


public class MyGridLayout extends JFrame{
	private GridLayout gridlayout;
	
	public MyGridLayout(String title, String argv[]) {
		super(title);
		int size = Integer.parseInt(argv[0]);
		gridlayout = new GridLayout(size,size);
		gridlayout.setVgap(5);
		gridlayout.setHgap(5);
		this.setLayout(gridlayout);
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				JButton button_n = new JButton ("(" + i + ", " + j + ")") ;
                button_n.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                this.add(button_n);
			}
		}
	}
	
	public static void main (String argv[]) {
		String [] tableau = {"5"}; 
		MyGridLayout frame = new MyGridLayout("GridLayout Button",tableau);
		frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
		frame.setLocation(200, 300);
		frame.pack();
	    frame.setVisible (true) ;
	}
	

}
