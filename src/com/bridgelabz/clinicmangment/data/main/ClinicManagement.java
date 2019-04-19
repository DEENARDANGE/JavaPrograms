package com.bridgelabz.clinicmangment.data.main;

import java.time.LocalDateTime;

import com.bridgelabz.clinicmangment.data.DoctorDataInterf;
import com.bridgelabz.clinicmangment.data.PatientDataInterf;
import com.bridgelabz.clinicmangment.data.impl.DoctorDataImpl;
import com.bridgelabz.clinicmangment.data.impl.PatientDataImpl;

public class ClinicManagement {

	public static void main(String args[]) {
		DoctorDataInterf dataDoctor = new DoctorDataImpl();
		PatientDataInterf dataPatient = new PatientDataImpl();
		dataDoctor.fileReadDoctor();
		String name = null;
		Long id = null ;
		LocalDateTime availability = null;
		String specilization = null;
		dataDoctor.addDoctor(name, id, specilization, availability);
		dataPatient.fileReadPatient();
	}
}
