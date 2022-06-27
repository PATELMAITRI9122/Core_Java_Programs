package tutorial_3;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIJFRAME extends JFrame{
	
	private JLabel item;
	
	public GUIJFRAME() {
		// TODO Auto-generated constructor stub
		
		super("Title bar");
		setLayout(new FlowLayout());
		
		item = new JLabel("This is JFRAME GUI");
		item.setToolTipText("Hover - TOOL TIP");
		
		add(item);
	}

}
