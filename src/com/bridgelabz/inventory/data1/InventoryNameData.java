package com.bridgelabz.inventory.data1;
public interface InventoryNameData{
	public void add(String name, double price, double weight);
	public void remove(String name, double price, double weight);
	public void calculate(String name, double price, double weight);
}
