package com.bridgelabz.inventorymanagement.main;

import com.bridgelabz.inventorymanagement.impl.InventoryManagerImpl;
import com.bridgelabz.inventorymanagement.interf.InventoryManager;

public class InventoryManagement {

	public static void main(String[] args)  {
		InventoryManager imp = new InventoryManagerImpl();
		//imp.fileRead();
		imp.calculateInventoryPrice();
		
	}

}