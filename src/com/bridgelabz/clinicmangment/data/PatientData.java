package com.bridgelabz.clinicmangment.data;

import java.util.List;

import com.bridgelabz.clinicmangment.model.Patient;

public interface PatientData {
	public void addPatient(Patient patient);

	public List<Patient> getPatient();

}
