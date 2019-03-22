package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class InsertionSortString<T> {
	public static void main(String[] args) {
		System.out.println("Enter number of elements to be sorted: ");
		int arraySize = AlgorithmLogic.getInt();
		String arr[] = AlgorithmLogic.input1DStringArray(arraySize);
		System.out.println("The sorted Array is:");
		AlgorithmLogic.inserstionSort(arr);
	}
}
