package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class WindChill {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		System.out.println(" t value is " + t);
		double v = Double.parseDouble(args[1]);
		System.out.println(" v value is " + v);
		double wind = FunctionalLogic.wind(t, v);
		System.out.println("distanct =" + wind);

	}

}
