//import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class Clock extends JFrame {
	public Clock(String title, int w, int h, Color color){
		  super(title);
		  this.setSize(w, h);
		  Container c =this.getContentPane();
		  c.setBackground(color);
		  JButton b=new JButton("South");
		  c.add(BorderLayout.SOUTH,b);
		  
		  JPanel p = new JPanel();
		  p.setBackground(new Color(150,0,150));
		  c.add(BorderLayout.CENTER,p);
		  
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setVisible(true);
	}
  public static void main(String[] args){
        Clock w1= new Clock("My Clock",1366,768,Color.RED);
        Clock w2= new Clock("hello",768,1366,Color.BLUE);
  }
}
