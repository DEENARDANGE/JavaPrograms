package com.bridgelabz.clinicmangment.data.main;

import java.util.List;

import com.bridgelabz.clinicmangment.data.DoctorData;
import com.bridgelabz.clinicmangment.data.PatientData;
import com.bridgelabz.clinicmangment.data.impl.DoctorDataImpl;
import com.bridgelabz.clinicmangment.data.impl.PatientDataImpl;
import com.bridgelabz.clinicmangment.model.Doctor;
import com.bridgelabz.clinicmangment.model.Patient;

public class ClinicManagement {
	public static void main(String args[]) {
		DoctorData data = new DoctorDataImpl();
		List<Doctor> doctors = data.getDoctore();
		data.addDoctore(null);
		PatientData datap = new PatientDataImpl();
		List<Patient> patient = datap.getPatient();
		datap.addPatient(null);
	}

}
