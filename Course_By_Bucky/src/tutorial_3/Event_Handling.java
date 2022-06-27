package tutorial_3;

import javax.swing.JFrame;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Event_Handling extends JFrame{
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JPasswordField pwd;
	
	public Event_Handling() {
		// TODO Auto-generated constructor stub
		
		super("The title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text here: ");
		add(item2);
		
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		pwd = new JPasswordField("Enter Password: ");
		add(pwd);
		
		theHandler handler = new theHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		
		pwd.addActionListener(handler);
				
	}
	
	private class theHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			String string = "";
			
			if (e.getSource() == item1) {
				string = String.format("Field 1: %s", e.getActionCommand());
			}else if (e.getSource() == item2) {
				string = String.format("Field 2: %s", e.getActionCommand());
			}else if (e.getSource() == item3) {
				string = String.format("Field 3: %s", e.getActionCommand());
			}else if (e.getSource() == pwd) {
				string = String.format("PWD: %s", e.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}

	
}
