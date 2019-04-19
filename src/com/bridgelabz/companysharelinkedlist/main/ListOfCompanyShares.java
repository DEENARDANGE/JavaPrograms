package com.bridgelabz.companysharelinkedlist.main;

import java.util.LinkedList;

import com.bridgelabz.companysharelinkedlist.impl.CompanyShareImpl;
import com.bridgelabz.companysharelinkedlist.interf.CompanyShareInterface;
import com.bridgelabz.companysharelinkedlist.model.CompanyShare;
import com.bridgelabz.util.AlgorithmLogic;

public class ListOfCompanyShares {

	public static void main(String[] args) {
		
		 CompanyShareInterface ref=new CompanyShareImpl();
		 LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
	     ref.add();
		System.out.println("enter the name you want to delet");
		String name=AlgorithmLogic.readString();
		ref.remove(name);
		ref.writeFile();
	}
}

