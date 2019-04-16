package com.bridgelabz.inventory.data.main;
import java.util.Scanner;

import com.bridgelabz.inventory.data.impl.InventoryImpl;
import com.bridgelabz.inventory.data1.InventoryNameData;


public class JSONInventory {
	public static void main(String[] args) {

		InventoryNameData inventaryImp = new InventoryImpl();
		{
			Scanner sc = new Scanner(System.in);
			inventaryImp.fileRead();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter weight");
			double  weight=sc.nextDouble();
			System.out.println("enter price");
			double price=sc.nextDouble();
			inventaryImp.add(name, weight, price);
			inventaryImp.calculateInventory();
			inventaryImp.writeFile();
			inventaryImp.remove(name);
		}

	}
}