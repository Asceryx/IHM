package Exercice5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyBorderLayout extends JFrame {
	private Font font;
	
	public MyBorderLayout(String title) {
		super(title);
		font = new Font("Book Antiqua", Font.PLAIN, 60) ;
		this.setLayout(new BorderLayout());
		
		setLabelFrame("NORTH", BorderLayout.NORTH);
		setLabelFrame("SOUTH", BorderLayout.SOUTH);
		setLabelFrame("CENTER", BorderLayout.CENTER);
		
		setLabelBox("WEST", BorderLayout.WEST);
		setLabelBox("EAST", BorderLayout.EAST);
	}
	
	
	public void setLabelFrame(String text, Object constraints) {
		JLabel label = new JLabel (text);
		label.setFont(font);
		label.setHorizontalAlignment (JLabel.CENTER) ;
		label.setBorder(BorderFactory.createLineBorder( Color.black));
		this.add(label, constraints);
	}
	
	public void setLabelBox(String text, Object constraints) {
		Box vertical_container = Box.createVerticalBox();
		int size = text.length();
		for (int i = 0; i<size ; i++)
		{
			Box letter_container = Box.createHorizontalBox();
			JLabel label = new JLabel(Character.toString(text.charAt(i)));
			label.setFont(font);
			letter_container.add(label);
			letter_container.setBorder(BorderFactory.createLineBorder( Color.black));
			vertical_container.add(letter_container, BorderLayout.CENTER);
		}
		Box frame_container = Box.createHorizontalBox();
		frame_container.add(vertical_container, BorderLayout.CENTER);
		this.add(frame_container, constraints);
	}
	
	public static void main (String argv[]) {
		MyBorderLayout frame = new MyBorderLayout("Border Layout");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
		frame.pack();
	    frame.setVisible (true) ;
	}

}
