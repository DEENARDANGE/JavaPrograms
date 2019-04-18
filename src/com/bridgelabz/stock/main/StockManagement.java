package com.bridgelabz.stock.main;

import java.util.Scanner;

import com.bridgelabz.stock.impl.StockImpl;
import com.bridgelabz.stock.interf.StockInterface;

public class StockManagement {
	public static void main(String[] args) {
        StockInterface stockImp=new StockImpl();
		{
			Scanner sc = new Scanner(System.in);
			stockImp.fileRead();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter noShare");
			long  noShare=sc.nextInt();
			System.out.println("enter price");
			double price=sc.nextDouble();
			stockImp.add( name,  noShare ,  price);
			stockImp.calculate(price);
			stockImp.totalStockValue();
			stockImp.writeFile();
			//stockImp.remove(name);
		}

	}

}
