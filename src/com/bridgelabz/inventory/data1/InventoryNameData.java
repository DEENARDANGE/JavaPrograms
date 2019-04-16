package com.bridgelabz.inventory.data1;
public interface InventoryNameData {
	public void fileRead();
	public double calculate(double price);
	public void writeFile();
	public void add(String name, double weight, double price);
	public void remove(String name);
	public void calculateInventory();
	
}
