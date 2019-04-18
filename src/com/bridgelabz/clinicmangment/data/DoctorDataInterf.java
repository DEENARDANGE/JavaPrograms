package com.bridgelabz.clinicmangment.data;

import java.time.LocalDateTime;

public interface DoctorDataInterf {
	public void fileRead();

	public void add(String name, int id, String specilization, LocalDateTime availability);

	public void search();

}
