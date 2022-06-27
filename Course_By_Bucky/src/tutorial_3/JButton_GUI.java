package tutorial_3;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_GUI extends JFrame {
	
	private JButton reg;
	private JButton custom;
	
	public JButton_GUI() {
		
		super("JBUtton Coding");
		setLayout(new FlowLayout());
		
		reg = new JButton("Reg Button");
		custom = new JButton("Custom Button");
		add(reg);
		add(custom);
		
	//	Icon b = new ImageIcon(getClass().getResource());
		
	}

}
