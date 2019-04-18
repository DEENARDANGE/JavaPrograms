package com.bridgelabz.clinicmangment.model;

import java.time.LocalDateTime;

public class DoctorData {
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String name;
	private String spacilization;
	private LocalDateTime avaibality;

	

	

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

	public LocalDateTime getAvailability() {
		return avaibality;
	}

	public void setAvaibality(LocalDateTime avaibality) {
		this.avaibality = avaibality;
	}

}
