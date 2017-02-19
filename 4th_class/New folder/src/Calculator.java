import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.*;

public class Calculator extends JFrame {
	public Calculator(String title, int w, int h, Color color) {
		super(title);
		setSize(w, h);
		Container c = this.getContentPane();
		//c.setBackground(color);
		//c.setLayout(new GridLayout(2, 1, 10, 10));
		Font FR = new Font("Times New Roman", Font.BOLD, 36);
		JTextField n = new JTextField("Texting");
		n.setFont(FR);
		n.setPreferredSize(new Dimension(768, 366));
		c.add(BorderLayout.NORTH, n);

		JPanel p = new JPanel();
		String[] s = { "C","AC","Ans","Back","7","8","9","/","4","5","6","*","1","2","3","-",".","0","+","=" };
		p.setBackground(color);
		p.setLayout(new GridLayout(5, 4, 10, 10));
		Font f = new Font("Arial", Font.BOLD, 24);
		JButton in[]= new JButton[s.length]; 
		for (int i = 0; i < s.length; i++) {
			in[i] = new JButton(s[i] + "");
			in[i].setFont(f);
			p.add(in[i]);
		}
		c.add(BorderLayout.CENTER, p);

		// GridBagLayout for fancier layout where some boxes are bigger than
		// others

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		Calculator w1 = new Calculator("Calculater", 768, 1366, Color.YELLOW);
	}
}