package com.bridgelabz.addressbook.Impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.Interf.AddressInterf;
import com.bridgelabz.addressbook.model.AdressBookData;
import com.bridgelabz.inventory.model.Inventory;
import com.bridgelabz.util.AlgorithmLogic;
import com.google.gson.Gson;

public class AddressBookImpl implements AddressInterf {
	JSONArray jsonArray;
	List<AdressBookData> addressList = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\addressbook\\main\\address.json"));
				System.out.println(jsonArray);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			for (Object obj : jsonArray) {
				AdressBookData address1 = new AdressBookData();

				jobject = (JSONObject) obj;
				String firstName = (String) jobject.get("firstName");
				String lastName = (String) jobject.get("lastName");
				String address = (String) jobject.get("address");
				String city = (String) jobject.get("city");
				String state = (String) jobject.get("state");
				Long zipCode = (Long) jobject.get("zipCode");
				Long phoneNo = (Long) jobject.get("phoneNo");
				address1.setFirstName(firstName);
				address1.setLastName(lastName);
				address1.setAddress(address);
				address1.setCity(city);
				address1.setState(state);
				address1.setZipCode(zipCode);
				address1.setPhoneNo(phoneNo);
				addressList.add(address1);
				System.out.println(address1.toString());
			}
		}
	}

	@Override
	public void add(String firstName,String lastName,String address,String city,String state,Long zipCode,Long phoneNo ) {
		AdressBookData address1 = new AdressBookData();
		address1.setFirstName(firstName);
		address1.setLastName(lastName);
		address1.setAddress(address);
		address1.setCity(city);
		address1.setState(state);
		address1.setZipCode(zipCode);
		address1.setPhoneNo(phoneNo);
		addressList.add(address1);
		addressList.forEach(add1 -> System.out.println(add1.toString()));


	}

	@Override
	public void remove() {
		AdressBookData address = new AdressBookData();
		System.out.println("enter the name you want to delete");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();

		addressList.removeIf(address2 -> address2.getLastName().equals(name1));
		System.out.println(addressList);
		System.out.println("removed successfully");
		write();


	}

	@Override
	public void write() {
		Gson gson = new Gson();
		String json = gson.toJson(addressList);
		System.out.println(json);
		System.out.println("===>" + addressList);

		try (FileWriter file = new FileWriter(
				"C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\FuctionalPgm\\\\src\\\\com\\\\bridgelabz\\\\addressbook\\\\main\\\\address.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void sortByLastName() {
		addressList.sort((AdressBookData s1,AdressBookData s2)->s1.getLastName().compareTo(s2.getLastName()));
		addressList.forEach((s)->System.out.println(s));
	}

	@Override
	public void sortByZipCode() {
		addressList.sort((AdressBookData s1,AdressBookData s2)->s1.getZipCode().compareTo(s2.getZipCode()));
		addressList.forEach((s)->System.out.println(s));
	}

}
