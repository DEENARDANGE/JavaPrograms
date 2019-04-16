package com.bridgelabz.stock.interf;

public interface StockInterface {
	public void fileRead();
	public double calculate(double price);
	public void writeFile();
	public void add(String name, int noShare , double price);
	public void calculateStock();
	
}
	


