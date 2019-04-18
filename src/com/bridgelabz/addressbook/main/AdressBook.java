package com.bridgelabz.addressbook.main;

import java.util.Scanner;

import com.bridgelabz.addressbook.Impl.AddressBookImpl;
import com.bridgelabz.addressbook.Interf.AddressInterf;
import com.bridgelabz.util.AlgorithmLogic;

public class AdressBook {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		AddressInterf adressdetails = new AddressBookImpl();
		adressdetails.fileRead();
		System.out.println("enter firstname");
		String firstName = sc.next();
		System.out.println("enter Lastname");
		String lastName = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		System.out.println("enter city");
		String city = sc.next();
		System.out.println("enter state");
		String state = sc.next();
		System.out.println("enter zipCode");
		Long zipCode = sc.nextLong();
		System.out.println("enter phoneNo");
		Long phoneNo = sc.nextLong();
		System.out.println("Enter your choice ");
		System.out.println("1.add \n 2.Sort by ZipCode \n 3.Sort By LastName \n 4.Remove");
		int ch = AlgorithmLogic.getInt();
		switch (ch) {
		case 1:
			adressdetails.add(firstName, lastName, address, city, state, zipCode, phoneNo);
		case 2:
			adressdetails.sortByZipCode();
		case 3:
			adressdetails.sortByLastName();
		case 4:
			adressdetails.remove();
		case 6:
			adressdetails.write();
		}
	}
}
