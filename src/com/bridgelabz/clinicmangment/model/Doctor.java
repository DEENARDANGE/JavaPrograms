package com.bridgelabz.clinicmangment.model;

import java.time.LocalDateTime;

public class Doctor {
	private int id;
	private String name;
	private String spacilization;
	private LocalDateTime avaibality;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpacilization() {
		return spacilization;
	}

	public void setSpacilization(String spacilization) {
		this.spacilization = spacilization;
	}

	public LocalDateTime getAvaibality() {
		return avaibality;
	}

	public void setAvaibality(LocalDateTime avaibality) {
		this.avaibality = avaibality;
	}

}
