package com.bridgelabz.algorithmprograms;

public class SqrtNewton {
	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15; // relative error tolerance
		double t = c; // estimate of the square root of c
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}
}
