package com.bridgelabz.clinicmangment.data;

import java.util.List;

import com.bridgelabz.clinicmangment.model.PatientData;

public interface PatientDataInterf {
	public void addPatient(PatientData patient);

	public List<PatientData> getPatient();

}
