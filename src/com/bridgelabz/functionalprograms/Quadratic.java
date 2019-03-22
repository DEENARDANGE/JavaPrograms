package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter the values of a, b and c");
		int a = FunctionalLogic.getInt();
		int b = FunctionalLogic.getInt();
		int c = FunctionalLogic.getInt();
		FunctionalLogic.quadratic(a, b, c);
	}

}
