import java.awt.*;
import java.awt.event.*;

//import java.awt.Color;
//import java.awt.Container;
import javax.swing.*;

/**
 * @author Bear
 *
 */

public class Calculator extends JFrame implements ActionListener {
	JTextField textfield = new JTextField("0");
	private double ans = 0.0;
	private int pp = -1, ps = -1, pm = -1, pd = -1, pa = -1;
	private StringBuffer buf;

	public Calculator(String title, int w, int h, Color color) {
		super(title);
		setSize(w, h);
		Container c = this.getContentPane();
		// c.setBackground(color);
		// c.setLayout(new GridLayout(2, 1, 10, 10));
		Font FR = new Font("Times New Roman", Font.BOLD, (int) (w / 100) * (h / 100));
		textfield.setFont(FR);
		textfield.setPreferredSize(new Dimension(w, h / 4));
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		c.add(BorderLayout.NORTH, textfield);
		JPanel p = new JPanel();
		String[] s = { "C", "AC", "Ans", "Back", "7", "8", "9", "¡Â", "4", "5", "6", "¡Á", "1", "2", "3", "-", ".", "0",
				"+", "=" };
		p.setBackground(color);
		p.setLayout(new GridLayout(5, 4, 10, 10));
		Font f = new Font("Arial", Font.BOLD, (int) (w / 120) * (h / 120));
		JButton in[] = new JButton[s.length];
		for (int i = 0; i < s.length; i++) {
			in[i] = new JButton(s[i] + "");
			in[i].setFont(f);
			p.add(in[i]);
			in[i].addActionListener(this);
			textfield.addActionListener(this);
		}
		c.add(BorderLayout.CENTER, p);

		// GridBagLayout for fancier layout where some boxes are bigger than
		// others

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		Calculator w1 = new Calculator("Calculater", 600, 800, Color.YELLOW);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		switch (label) {
		case "AC":
			AC();
			break;
		case "C":
			C();
			break;
		/*
		 * case "Ans": Ans(); break;
		 */
		case "Back":
			Back();
			break;
		default:
			if (label.equals("=")) {
				run(buf = new StringBuffer(textfield.getText()));
			} else {
				Number(label);
			}

		}
	}

	boolean isFirstDigit = true;

	public void Number(String num) {
		if (isFirstDigit) {
			textfield.setText(num);
		} else if ((num.equals(".")) && (textfield.getText().indexOf(".")) < 0) {
			textfield.setText(textfield.getText() + ".");
		} else if (!num.equals(".")) {
			textfield.setText(textfield.getText() + num);
		}
		isFirstDigit = false;
	}

	public void run(StringBuffer text) {
		if ((pa = text.indexOf("Ans")) >= 0) {
			text = new StringBuffer(text.substring(0, pa) + ans + text.substring(pa + 3, textfield.getText().length()));
			run(text);
		} else {
			if ((pp = text.indexOf("+")) >= 0) {
				if (isNumeric(text.substring(0, pp)) && isNumeric(text.substring(pp + 1, text.length()))) {
					text = new StringBuffer(String.valueOf(Double.valueOf(text.substring(0, pp))
							+ Double.valueOf(text.substring(pp + 1, text.length()))));
				} else {
					run(buf = new StringBuffer(text.substring(pp + 1, textfield.getText().length())));
				}
			}
			if ((ps = text.indexOf("-")) >= 0) {
				text = new StringBuffer(String.valueOf(
						Double.valueOf(text.substring(0, ps)) - Double.valueOf(text.substring(ps + 1, text.length()))));
				run(text);
			}
			if ((pm = text.indexOf("¡Á")) >= 0) {
				text = new StringBuffer(String.valueOf(
						Double.valueOf(text.substring(0, pm)) * Double.valueOf(text.substring(pm + 1, text.length()))));
				run(text);
			}
			if ((pd = text.indexOf("¡Â")) >= 0) {
				text = new StringBuffer(String.valueOf(
						Double.valueOf(text.substring(0, pd)) / Double.valueOf(text.substring(pd + 1, text.length()))));
				run(text);
			}
			ans = Double.valueOf(text.toString());
			textfield.setText(String.valueOf(ans));
		}

	}

	public void AC() { // Clear all
		textfield.setText("0");
		isFirstDigit = true;
		ans = 0;
	}

	public void C() { // Clear the textfield
		textfield.setText("0");
		isFirstDigit = true;
	}

	public void Ans() { // THE RESULT OF LAST CALCULATE
		textfield.setText(textfield.getText() + "ANS");
	}

	public void Back() { // Backspace
		textfield.setText(textfield.getText().substring(0, textfield.getText().length() - 1));
	}

	public static boolean isNumeric(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
