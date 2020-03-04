package Exercice4;

import java.awt.BorderLayout ;
import java.awt.ComponentOrientation;

import javax.swing.Box;

import javax.swing.JFrame ;
import javax.swing.JLabel ;

import Exercice3.MyGridLayout;

public class MyBoxLayout extends JFrame {
	
	public MyBoxLayout(String title)
	{
		super(title);
		this.setLayout(new BorderLayout());
		Box north_box = Box.createHorizontalBox();
		
		JLabel east_box_label = new JLabel ("Hello Happy Tax Payers") ;
		east_box_label.setHorizontalAlignment (JLabel.CENTER) ;
        
        JLabel west_box_label = new JLabel ("Just say hello") ;
        west_box_label.setHorizontalAlignment (JLabel.CENTER) ;
        
        north_box.add (east_box_label, BorderLayout.EAST);
        north_box.add(Box.createGlue());
        north_box.add(west_box_label, BorderLayout.WEST);
        
        
        JLabel center_frame_label = new JLabel ("Happy") ;
        center_frame_label.setHorizontalAlignment (JLabel.CENTER) ;
        
        JLabel south_frame_label = new JLabel ("Droopy") ;
        south_frame_label.setHorizontalAlignment (JLabel.CENTER) ;
        
        
        this.add(north_box, BorderLayout.NORTH);
        this.add(center_frame_label, BorderLayout.CENTER);
        this.add(south_frame_label, BorderLayout.SOUTH);
        
	}
	
	public static void main (String argv[]) {
		MyBoxLayout frame = new MyBoxLayout("Tex Avery");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
		frame.pack();
	    frame.setVisible (true) ;
	}
	

}
