package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class TwoDimentaionalArray {
	public static void main(String[] args) {
		System.out.println("enter the row");
		int row = FunctionalLogic.getInt();
		System.out.println("enter the col");
		int col = FunctionalLogic.getInt();
		FunctionalLogic.array(row, col);

	}
}
