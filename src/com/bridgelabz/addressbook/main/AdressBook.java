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
		
		System.out.println("Enter your choice ");
		System.out.println("1.add \n 2.Sort by ZipCode \n 3.Sort By LastName \n 4.Remove");
		int ch = AlgorithmLogic.getInt();
		switch (ch) {
		case 1:
			System.out.println("Add the new person in address book");
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
			adressdetails.add(firstName, lastName, address, city, state, zipCode, phoneNo);
			adressdetails.write();
			break;
		case 2:
			System.out.println("The address details are sorted by using Zipcode");
			adressdetails.sortByZipCode();
			break;
		case 3:
			System.out.println("The address details are sorted by using LastName");
			adressdetails.sortByLastName();
			break;
		case 4:
			System.out.println("Remove the details from AdressBook");
			adressdetails.remove();
			adressdetails.write();
			break;
			default : System.out.println("please enter the valid num");
		}
	}
}
