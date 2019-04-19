package com.bridgelabz.clinicmangment.data.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.clinicmangment.data.PatientDataInterf;
import com.bridgelabz.clinicmangment.model.PatientData;

public class PatientDataImpl implements PatientDataInterf {

	JSONArray jsonArray;
	List<PatientData> patientList = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	@Override
	public void fileReadPatient() {
		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\clinicmangment\\model\\Patient.json"));
				System.out.println(jsonArray);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			for (Object obj : jsonArray) {
				PatientData Patient1 = new PatientData();

				jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				Long id = (Long) jobject.get("id");
				Long mobileNo = (Long) jobject.get("mobileNo");
				Long age = (Long) jobject.get("age");

				Patient1.setName(name);
				Patient1.setId(id);
				Patient1.setMobileNo(mobileNo);
				Patient1.setAge(age);
				patientList.add(Patient1);
				System.out.println(Patient1.toString());
			}
		}

	}

	@Override
	public void addPatient(String name, int id, Long mobileNo, Long age) {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchPatient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writePatient() {
		// TODO Auto-generated method stub

	}

}
