import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.*;

public class Button extends JFrame {
	public Button(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		JButton b = new JButton("Ok");
		c.add(BorderLayout.EAST, b);
		b = new JButton("Cancel");
		c.add(BorderLayout.WEST, b);
		b = new JButton("What?");
		c.add(BorderLayout.NORTH, b);
		b = new JButton("Yo!");
		c.add(BorderLayout.SOUTH, b);
		b = new JButton("жа");
		c.add(BorderLayout.CENTER, b);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		Button w1 = new Button("My Clock", 400, 400, Color.YELLOW);	
	}
}