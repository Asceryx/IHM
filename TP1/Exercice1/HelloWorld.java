package Exercice1;

import java.awt.Font ;

import javax.swing.JFrame ;
import javax.swing.JLabel;


public class HelloWorld extends JFrame {
	private Font font;
	private JLabel label;
	
	
	public HelloWorld(String title) {
		super(title);
		font = new Font("Book Antiqua", Font.PLAIN, 60);
		label = new JLabel("Hello World");
		label.setFont(font);
	}
	
	public static void main (String argv[]) {
		HelloWorld app = new HelloWorld("Hello World");
		app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		app.pack();
	    app.setVisible (true) ;
	}

}
