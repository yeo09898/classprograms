import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.*;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		JButton b = new JButton("Ok");
		c.add(BorderLayout.EAST, b);

		JPanel p = new JPanel();
		String[] s={"9","8","7","6","5","4","3","2","1","0","��"};
		p.setBackground(new Color(150, 0, 150));
		p.setLayout(new GridLayout(3, 3, 3, 10));
		Font f = new Font("Arial", Font.BOLD, 24);
		for (int i = 0; i < 11; i++) {
			b = new JButton(s[i]);
			b.setFont(f);
			p.add(b);
		}
		c.add(BorderLayout.CENTER, p);
		
		//GridBagLayout for fancier layout where some boxes are bigger than others
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		GridLayoutTest w1 = new GridLayoutTest("My Clock", 768, 1366, Color.YELLOW);	
	}
}