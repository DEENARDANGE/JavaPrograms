package com.bridgelabz.clinicmangment.model;

public class PatientData {
	private String name;
	private Long id;
	private Long mobileNo;
	private Long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name  : " + name + "\n" + "id: " + id + "\n" + "mobileNo : " + mobileNo + "\n"
				+ "age : " + age + "\n";

	}
	
}
