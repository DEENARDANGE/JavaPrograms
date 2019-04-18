package com.bridgelabz.addressbook.Interf;

public interface AddressInterf {
	public void fileRead();
	public void remove();
	public void write();
	public  void sortByLastName();
	public void sortByZipCode();
	public void add(String firstName, String lastName, String address, String city, String state, Long zipCode, Long phoneNo);

}
