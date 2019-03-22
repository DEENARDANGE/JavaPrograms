package com.bridgelabz.common.utils;

import java.util.Scanner;

public class InputUtility {

	static Scanner Scanner = new Scanner(System.in);
	public static int readIntValues() {
		return Scanner.nextInt();
	}

	public static Double readDoubleValue() {
		return Scanner.nextDouble();
	}

	public static String readString() {
		return Scanner.next();
	}
}
