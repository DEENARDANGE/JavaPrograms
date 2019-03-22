package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Coupon {
	public static void main(String[] args) {
		System.out.println("enter the num");
		int num = FunctionalLogic.getInt();
		FunctionalLogic.coupon(num);
		int count = FunctionalLogic.collect(num);

		System.out.println(count);
	}
}
