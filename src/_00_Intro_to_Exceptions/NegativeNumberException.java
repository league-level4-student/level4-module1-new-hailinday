package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	public static void scaryPopup () {
		JOptionPane.showMessageDialog(null, "You have triggered a critical error in your computer.");
	}
	
	public static void testPositive (int x) throws Exception {
		if (x<0) {
			throw new NegativeNumberException();
		}
	}
	public static void main(String[] args) {
		try {
			testPositive(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			scaryPopup();
		} finally {
			JOptionPane.showMessageDialog(null, "Your computer is fine.");
		}
	}
}
