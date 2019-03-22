package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class StringReplacement {
	static String Str4;

	public static void main(String[] args) {
		String Str2 = "username";
		System.out.print("Original String : ");
		String Str3 = "hello<<username>>,how are you?";
		System.out.println(Str3);
		System.out.print("enter the UserName :");
		String Str1 = FunctionalLogic.getString();
		Str4 = FunctionalLogic.replace(Str1, Str2, Str3);
		System.out.print("Replaced  String : ");
		System.out.print(Str4);

	}
}
