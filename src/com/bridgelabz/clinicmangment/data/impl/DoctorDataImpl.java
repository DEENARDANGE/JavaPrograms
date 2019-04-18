package com.bridgelabz.clinicmangment.data.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.model.AdressBookData;
import com.bridgelabz.clinicmangment.data.DoctorDataInterf;
import com.bridgelabz.clinicmangment.model.DoctorData;

public class DoctorDataImpl implements DoctorDataInterf {
	JSONArray jsonArray;
	List<DoctorData> doctorList = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\clinicmangment\\model\\Doctor.json"));
				System.out.println(jsonArray);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			for (Object obj : jsonArray) {
				DoctorData doctor1 = new DoctorData();

				jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				Long id = (Long) jobject.get("id");
				String specilization = (String) jobject.get("specilization");
				LocalDateTime availability = (LocalDateTime) jobject.get("availability");

				doctor1.setName(name);
				doctor1.setId(id);
				doctor1.setSpacilization(specilization);
				doctor1.setAvaibality(availability);
				doctorList.add(doctor1);
				System.out.println(doctor1.toString());
			}
		}
	}

	@Override
	public void add(String name, int id, String Splecilization, LocalDateTime availability) {

	}

	@Override
	public void search() {
		// TODO Auto-generated method stub

	}

}
