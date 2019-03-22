package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.AlgorithmLogic;
import com.bridgelabz.util.FunctionalLogic;

public class Permutation2 {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		String string = FunctionalLogic.getString();
		System.out.println("The combination Of String is ");

		int l = string.length();
		AlgorithmLogic.permute(string, 0, l - 1);
	}

}
