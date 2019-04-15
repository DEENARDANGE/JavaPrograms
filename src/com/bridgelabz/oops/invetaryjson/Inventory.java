package com.bridgelabz.oops.invetaryjson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(
				"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\oops\\invetaryjson\\Inventory.json"));
		JSONObject jo = (JSONObject) obj;
		JSONArray inventory = (JSONArray) jo.get("inventory");
		inventory.forEach(inv -> parseinventoryObject((JSONObject) inv));

	}

	private static void parseinventoryObject(JSONObject inventory) {
		JSONObject InvObject = (JSONObject) inventory.get("inventory");

		String Name = (String) InvObject.get("name");
		System.out.println(Name);

		double price = (double) InvObject.get("price");
		System.out.println(price);

		double weight = (double) InvObject.get("weight");
		System.out.println(weight);
	}
}