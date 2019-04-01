package com.bridgelabz.datastructure;

import com.bridgelabz.util.AlgorithmLogic;
import com.util.datastructure.Snippet;

public class BalancedParan {
	public static void main(String[] args) {
		System.out.println("Enter expression: ");
		String input = AlgorithmLogic.readString();
		char[] ch = input.toCharArray();

		if (Snippet.areParenthesisBalanced(ch))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}