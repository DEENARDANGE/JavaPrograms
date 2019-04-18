package com.bridgelabz.addressbook.model;

public class AdressBookData {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private Long zipCode;
	private Long phoneNo;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	 @Override
	    public String toString() {
	        return   "firstName  : "+firstName+"\n"
	                +"lastName: "+lastName+"\n"
	                +"address : "+address+"\n"
	                +"city : "+city+"\n"
	                +"state : "+state+"\n"
	                +"zipCode : "+zipCode+"\n"
	                +"phoneNo : "+phoneNo+"\n";
	    }
}
