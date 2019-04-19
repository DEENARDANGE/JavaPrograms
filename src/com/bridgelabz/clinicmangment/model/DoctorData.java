package com.bridgelabz.clinicmangment.model;

import java.time.LocalDateTime;

public class DoctorData {
	private Long id;
	public void setId(Long id) {
		this.id = id;
	}

	private String name;
	private String specialization;
	private LocalDateTime availability;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public LocalDateTime getAvailability() {
		return availability;
	}

	public void setAvailability(LocalDateTime availability) {
		this.availability = availability;
	}

	public Long getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name  : " + name + "\n" + "id: " + id + "\n" + "specialization : " + specialization + "\n"
				+ "availability : " + availability + "\n";

	}
}
