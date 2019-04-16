package com.bridgelabz.stock.impl;

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

import com.bridgelabz.inventory.model.Inventory;
import com.bridgelabz.stock.interf.StockInterface;
import com.bridgelabz.stock.model.Stock;
import com.google.gson.Gson;

public class StockImpl implements StockInterface {
	JSONArray jsonArray;
	List<Stock> stocks = new ArrayList<>();

	JSONObject jobject = new JSONObject();


	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\stock\\main\\Stock.json"));
				System.out.println( jsonArray);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}

			for (Object obj : jsonArray) {
				Stock stock1 = new Stock();

				jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				double price = ((Double) jobject.get("price")).doubleValue();
				
				int noShare=(int) jobject.get("noStock");
				stock1.setNoShare(noShare);
				stock1.setName(name);
				stock1.setPrice(price);
				stocks.add(stock1);
				System.out.println(stock1.toString());

			}
		}		
	}

	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(stocks);
		System.out.println(json);
		System.out.println("===>" + stocks);

		try (FileWriter file = new FileWriter(
				"C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\FuctionalPgm\\\\src\\\\com\\\\bridgelabz\\\\stock\\\\main\\\\Stock.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void add(String name, int noShare, double price) {
		Stock stock1 = new Stock();
		stock1.setName(name);
		stock1.setPrice(price);
		stock1.setNoShare(noShare);
		stocks.add(stock1);
		stocks.forEach(inventory1 -> System.out.println(inventory1.toString()));
		
	}

	@Override
	public void calculateStock() {
		// TODO Auto-generated method stub
		
	}

}
