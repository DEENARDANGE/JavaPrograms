package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class StringReplacementRegex {
	public static void main(String[] args) {
		String sentance = "hello <<userName>>,how are you";
		System.out.println("Original String : " + sentance);
		System.out.println("enter the UserName :");
		String userName = FunctionalLogic.getString();
		System.out.println(FunctionalLogic.replaceUserName(sentance, userName));
	}
}
