package _06_Hospital;

public class Patient {
	boolean check = false;
	public void checkPulse() {
		check = true;
	}
	public boolean feelsCaredFor() {
		if (check == true) {
			return true;
		}
		return false;
		
	}
}
