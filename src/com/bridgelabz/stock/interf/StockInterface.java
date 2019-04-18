package com.bridgelabz.stock.interf;

public interface StockInterface {
	public void fileRead();
	public double calculate(double price);
	public void writeFile();
	public void add(String name, long noShare , double price);
	public void totalStockValue();
	
}
	


