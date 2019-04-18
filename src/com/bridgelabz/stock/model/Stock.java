package com.bridgelabz.stock.model;

public class Stock {
	private String name;
	private long noShare;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNoShare() {
		return noShare;
	}
	public void setNoShare(long noShare) {
		this.noShare = noShare;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	 @Override
	    public String toString() {
	        return   "name  : "+name+"\n"
	                +"noShare: "+noShare+"\n"
	                +"price : "+price+"\n" ;
	    }
	
}
