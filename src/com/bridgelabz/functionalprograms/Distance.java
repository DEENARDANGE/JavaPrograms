package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Distance {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		System.out.println(" x value is " + x);
		int y = Integer.parseInt(args[1]);
		System.out.println(" y value is " + y);
		double dist = FunctionalLogic.dist(x, y);
		System.out.println("distanct =" + dist);
	}
}
