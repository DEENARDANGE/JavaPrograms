package com.bridgelabz.stockAccount.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.common.exception.InternalServerError;
import com.bridgelabz.stockAccount.interf.StockAccountService;
import com.bridgelabz.stockAccount.model.StockAccount;
import com.bridgelabz.util.AlgorithmLogic;
import com.google.gson.Gson;

public class StockAccountServiceImpl implements StockAccountService {
	List<StockAccount> stocks = new ArrayList<>();
	StockAccount newStock = new StockAccount();

	public void createStockAccount() {
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser.parse(new FileReader(
					"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\stockAccount\\main\\StockAccountDetails.json"));
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);
			JSONArray jsonArray = (JSONArray) jsonObject.get("ShareHolders");

			for (Object obj1 : jsonArray) {
				StockAccount parameters = new StockAccount();
				String stockCompany = (String) ((JSONObject) obj1).get("stockCompany");
				double noOfShares = (double) ((JSONObject) obj1).get("noOfShares");
				double sharePrice = (double) ((JSONObject) obj1).get("sharePrice");
				String date = (String) ((JSONObject) obj1).get("currentDateTime");

				parameters.setStockCompany(stockCompany);

				parameters.setNoOfShares(noOfShares);
				parameters.setSharePrice(sharePrice);
				parameters.setCurrentDateTime(date);
				stocks.add(parameters);

			}

		} catch (Exception e) {
			throw new InternalServerError("File Reading failed ", e);
		}
	}

	@Override
	public double valueOf() {
		stocks.forEach(stock -> {
			System.out.println("Gain of stocks on " + stock.getStockCompany() + " is "
					+ (stock.getNoOfShares() * stock.getSharePrice()));
		});
		return 0;
	}

	public void buy(String stockCompany, double sharePrice) {

		newStock.setStockCompany(stockCompany);
		newStock.setSharePrice(sharePrice);

		LocalDateTime currentDateTime = LocalDateTime.now();
		newStock.setCurrentDateTime(currentDateTime.toString());

		System.out
				.println("You bought the stock" + newStock.getStockCompany() + "for" + " " + newStock.getSharePrice());
		System.out.println("Enter the number of shares ");
		double noOfShares = AlgorithmLogic.getDouble();
		newStock.setNoOfShares(noOfShares);
		stocks.add(newStock);
		stocks.forEach(stock -> System.out.println(stock.toString()));
	}

	@Override
	public void sell(String stockCompany, double sharePrice) {

		newStock.setStockCompany(stockCompany);
		newStock.setSharePrice(sharePrice);

		LocalDateTime currentDateTime = LocalDateTime.now();
		newStock.setCurrentDateTime(currentDateTime.toString());
		System.out.println(
				"You are selling the stock" + newStock.getStockCompany() + "for" + " " + newStock.getSharePrice());
		stocks.removeIf(inventory -> inventory.getStockCompany().equals(stockCompany));
		System.out.println("Element successfully removed");
		stocks.forEach(stock -> System.out.println(stock.toString()));
	}

	@Override
	public void save() {
		Gson gson = new Gson();
		String json = gson.toJson(stocks);
		try {
			FileWriter file = new FileWriter(
					"C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\stockAccount\\main\\StockAccountDetails.json");
			file.write("{\"ShareHolders\":" + json + "}");
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void printReport() {
		stocks.forEach(stock -> System.out.println(stock.toString()));
	}

}