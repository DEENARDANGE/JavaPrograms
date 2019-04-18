package com.bridgelabz.clinicmangment.data.main;

import java.time.LocalDateTime;

import com.bridgelabz.clinicmangment.data.DoctorDataInterf;
import com.bridgelabz.clinicmangment.data.impl.DoctorDataImpl;

public class ClinicManagement {

	public static void main(String args[]) {
		DoctorDataInterf data = new DoctorDataImpl();
		data.fileRead();
		String name = null;
		int id = 0;
		LocalDateTime availability = null;
		String specilization = null;
		data.add(name, id, specilization, availability);
	}

}
