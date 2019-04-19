package com.bridgelabz.stockAccount.main;

import com.bridgelabz.stockAccount.impl.StockAccountServiceImpl;
import com.bridgelabz.stockAccount.interf.StockAccountService;
import com.bridgelabz.util.AlgorithmLogic;

public class MyStockAccount {

	public static void main(String[] args) {

		StockAccountService stockImp = new StockAccountServiceImpl();

		{

			stockImp.createStockAccount();
			System.out.println("Input choice");
			int input = AlgorithmLogic.getInt();
			switch (input) {

			case 1:
				System.out.println("Choose a stock Company you want to buy");
				String StockCompany = AlgorithmLogic.readString();
				System.out.println("Enter the amount you are buying for:");
				double sharePrice = AlgorithmLogic.getDouble();
				stockImp.buy(StockCompany, sharePrice);
				stockImp.save();
				break;
			case 2:
				System.out.println("Choose a stock Company you want to sell");
				String SellCompany = AlgorithmLogic.readString();
				System.out.println("Enter the amount you are selling for:");
				double sharePrice1 = AlgorithmLogic.getDouble();
				stockImp.sell(SellCompany, sharePrice1);
				stockImp.save();
				break;
			case 3:
				stockImp.valueOf();
				break;
			case 4:
				stockImp.printReport();
				break;
			}

		}

	}

}
