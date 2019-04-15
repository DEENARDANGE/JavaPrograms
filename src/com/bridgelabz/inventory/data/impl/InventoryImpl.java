package com.bridgelabz.inventory.data.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventory.data1.InventoryNameData;
import com.bridgelabz.inventory.model.Inventory;
import com.bridgelabz.util.AlgorithmLogic;
import com.google.gson.Gson;

public class InventoryImpl implements InventoryNameData {

	static List<Inventory> listinv1 = new ArrayList<Inventory>();
	// JSON parser object to parse read file
	static JSONParser jsonParser = new JSONParser();

	@SuppressWarnings({ "unchecked", "unused" })
	public static void fileRead() {
		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader(
				"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\oops\\invetaryjson\\Inventory.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONArray invenList = (JSONArray) obj;

			System.out.println(invenList);
			InventoryImpl invent = new InventoryImpl();
			invenList.forEach(inv -> invent.parseInvenObject((JSONObject) inv));
			listinv1.addAll(invenList);
			System.out.println(listinv1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void parseInvenObject(JSONObject inventory) {
		JSONObject invenObject = (JSONObject) inventory.get("inventory");
		String Name = (String) invenObject.get("name");
		System.out.println(Name);
		double price = (double) invenObject.get("price");
		System.out.println(price);

		double weight = (double) invenObject.get("weight");
		System.out.println(weight);
	}

	List<Inventory> listinv = new ArrayList<Inventory>();

	@SuppressWarnings("unused")
	@Override
	public void add(String name, double price, double weight) {
		JSONObject obj = new JSONObject();
		// fileRead fr=new fileRead();
		Inventory addinv = new Inventory();
		System.out.println("enter the name :");
		String addName = AlgorithmLogic.readString();
		addinv.setName(addName);
		System.out.println("Enter the price:");
		double addPrice = AlgorithmLogic.getDouble();
		addinv.setPrice(addPrice);
		System.out.println("Enter the weight ");
		double addWeight = AlgorithmLogic.getDouble();
		addinv.setWeight(addWeight);
		listinv.add(addinv);

		listinv.forEach(inventory1 -> System.out.println(inventory1.toString()));
		listinv1.addAll(listinv);

		Gson gson = new Gson();
		String json = gson.toJson(listinv1);

		try (

				FileWriter file = new FileWriter(
						"C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\FuctionalPgm\\\\src\\\\com\\\\bridgelabz\\\\oops\\\\invetaryjson\\\\Inventory.json")) {
			file.write(json);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void remove(String name, double price, double weight) {
		Inventory removinv = new Inventory();
		System.out.println("enter the name to be removed :");
		String removename = AlgorithmLogic.readString();
		if ((removinv.getName() == removename)) {
			listinv.remove(name);
		}
		listinv.forEach(inventory1 -> System.out.println(inventory1.toString()));
	}

	@Override
	public void calculate(String name, double price, double weight) {
		listinv.forEach(inventory1 -> System.out.println(inventory1.toString()));
		listinv.forEach(inventory -> {
			System.out.println(
					"Total price of " + inventory.getName() + " is " + (inventory.getPrice() * inventory.getWeight()));
		});
	}

}