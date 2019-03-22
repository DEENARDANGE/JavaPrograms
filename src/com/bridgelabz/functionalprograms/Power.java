package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Power {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("num is " + num);
		if (num < 31) {
			int powerofnum = FunctionalLogic.power(num);
			if (powerofnum < 31)
				System.out.println("Powers of 2 that are less than 2^" + num);
			else
				System.out.println(" enter the value of n is less than 31");
		}
	}

}
