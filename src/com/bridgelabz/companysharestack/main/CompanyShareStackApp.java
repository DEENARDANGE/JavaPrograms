package com.bridgelabz.companysharestack.main;

import java.util.LinkedList;

import com.bridgelabz.companysharelinkedlist.model.CompanyShare;
import com.bridgelabz.companysharestack.impl.CompanyShareStackImpl;
import com.bridgelabz.util.AlgorithmLogic;

public class CompanyShareStackApp {
	public static void main(String[] args) {

		CompanyShareStackImpl ref = new CompanyShareStackImpl();
		LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
		ref.add();
		System.out.println("enter the name you want to delet");
		String name = AlgorithmLogic.readString();
		ref.remove(name);
		ref.writeFile();
	}
}
