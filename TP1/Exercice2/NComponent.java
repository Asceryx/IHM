package Exercice2;

import java.awt.Font ;
import java.awt.FlowLayout ;
    
import javax.swing.JFrame ;
import javax.swing.JButton ;
import javax.swing.Box;


public class NComponent extends JFrame{
	private Font font;
	private Box h_box;
	
	public NComponent(String title, String argv[]) {
		super(title);
		
		font = new Font("Book Antiqua", Font.PLAIN, 60) ;
		h_box = Box.createHorizontalBox();
		int nb_button = Integer.parseInt(argv[0]);
		
		for (int i = 0; i<nb_button ; i++)
		{
			JButton my_button_n = new JButton ("" + i) ;
	        my_button_n.setFont (font) ;
	        h_box.add (my_button_n);
		}
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.add(h_box);
	}
	
	public static void main (String argv[]) {
		String [] tableau = {"3"}; 
		NComponent frame = new NComponent("Button",tableau);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
		frame.setLocation(200, 300);
		frame.pack();
	    frame.setVisible (true) ;
	}
}
