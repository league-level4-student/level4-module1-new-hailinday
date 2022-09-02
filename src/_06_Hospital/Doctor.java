package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient x) throws Exception {
		if (patients.size()>3) {
			throw new Exception();
		}
		patients.add(x);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
	

}
