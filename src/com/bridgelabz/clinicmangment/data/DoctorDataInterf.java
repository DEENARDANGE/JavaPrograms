package com.bridgelabz.clinicmangment.data;

import java.time.LocalDateTime;

public interface DoctorDataInterf {
	public void fileReadDoctor();
    public void writeDoctor();
	public void addDoctor(String name, Long id, String specilization, LocalDateTime availability);
    public void removeDoctor();
	public void searchDoctor();

}
