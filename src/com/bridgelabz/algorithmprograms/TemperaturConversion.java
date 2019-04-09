package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class TemperaturConversion {
	public static void main(String[] args) {
		System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		int ch =  AlgorithmLogic.getInt();
		choose(ch);
	}

	private static void choose(int ch) {
		switch (ch) {
		case 1:
			System.out.println("Enter  Fahrenheit temperature");
			double f =  AlgorithmLogic.getDouble();
			double c = (f - 32) * 5 / 9;
			System.out.println("Celsius temperature is = " + c);
			break;
		case 2:
			System.out.println("Enter  Celsius temperature");
			c =  AlgorithmLogic.getDouble();
			f = ((9 * c) / 5) + 32;
			System.out.println("Fahrenheit temperature is = " + f);
			break;
		default:
			System.out.println("please choose valid choice");
		}

	}
}
