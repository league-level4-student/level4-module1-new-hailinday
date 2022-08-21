package _06_Hospital;

import java.util.ArrayList;

abstract class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient x) {
		patients.add(x);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
}
