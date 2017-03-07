import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TTE1  implements ActionListener {
	JFrame wind;  
    JPanel jpanel;  
    JButton jb1, jb2, jb3;    
    JScrollPane jscrollPane; 
	JTextArea textarea = new JTextArea("Welcome");
	public TTE1(String title, int w, int h) {
		wind = new JFrame(title);
		wind.setSize(w, h);
		Container c = wind.getContentPane();
		c.setLayout(new BorderLayout());
		textarea.setFont(new Font("Times New Roman", Font.BOLD, (int) (w / 100) * (h / 100)));
		textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        jscrollPane = new JScrollPane(textarea);  
        jpanel = new JPanel();  
        jpanel.setLayout(new GridLayout(1, 3));  
        jb1 = new JButton("Copy");  
        jb1.addActionListener(this);
        
        jpanel.add(jb1);
        c.add(BorderLayout.CENTER,jscrollPane);
        c.add(BorderLayout.WEST,jpanel);
        wind.setVisible(true);
	}

	public static void main(String[] args) {
		TTE1 w1 = new TTE1("Text Editor", 600, 800);
	}

	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		textarea.setText(label);
		System.out.println(label);
	}
}
