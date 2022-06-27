package tutorial_3;

import javax.swing.JOptionPane;

public class GUI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fn = JOptionPane.showInputDialog("Enter First Number: ");
		String sn = JOptionPane.showInputDialog("Enter the second number: ");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int total = num1+num2;
		
		JOptionPane.showMessageDialog(null, "The answer is: " +total,"The title", JOptionPane.PLAIN_MESSAGE);

	}

}
