package com.bridgelabz.companysharestack.interf;

public interface CompanyShareStackInterf {
	public void add();

	public void buy(String stockCompany, double sharePrice);

	public void sell(String stockCompany, double sharePrice);
	public double valueOf();

	public void remove(String name);

	public void fileRead();

	public void writeFile();

}
