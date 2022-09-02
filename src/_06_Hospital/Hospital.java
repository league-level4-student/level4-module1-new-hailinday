package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void addDoctor(Doctor x) {
		doctors.add(x);
	}
	public void addPatient(Patient x) {
		patients.add(x);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void assignPatientsToDoctors() throws Exception {
		while (patients.size()>0) {
			for (int i = 0; i < doctors.size(); i++) {
				if (doctors.size()<=3) {
					doctors.get(i).assignPatient(new Patient());
					patients.remove(0);
				}
			}
		}
	}
}
