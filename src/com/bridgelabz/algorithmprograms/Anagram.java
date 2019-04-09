package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmLogic;
public class Anagram {
	public static void main(String args[]) {
		System.out.println("The first String is : ");
		String string1 = AlgorithmLogic.readString();
		System.out.println("The another String is : ");
		String string2 = AlgorithmLogic.readString();
		String str1 = string1.toUpperCase();
		String str2 = string2.toUpperCase();
		boolean isAnagarm = AlgorithmLogic.isAnagram(str1, str2);
		if (isAnagarm)
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}

}
