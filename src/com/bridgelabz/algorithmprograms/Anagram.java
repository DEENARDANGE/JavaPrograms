package com.bridgelabz.algorithmprograms;

import com.bridgelabz.common.utils.InputUtility;
import com.bridgelabz.util.AlgorithmLogic;

public class Anagram {
	public static void main(String args[]) {
		System.out.println("The first String is : ");
		String string1 = InputUtility.readString();
		System.out.println("The another String is : ");
		String string2 = InputUtility.readString();

		char[] char1 = string1.toUpperCase().toCharArray();
		char[] char2 = string2.toUpperCase().toCharArray();

		boolean isAnagarm = AlgorithmLogic.isAnagram(char1, char2);

		if (isAnagarm)
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}

}
