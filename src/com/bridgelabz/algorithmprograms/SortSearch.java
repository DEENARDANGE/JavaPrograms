package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class SortSearch {
	public static long start = 0;
	public static long end = 0;
	public static long elapsed;
	static int ch = 0;

	public static void main(String[] args) {
		do {
			System.out.println("--------Menu for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for String");
			System.out.println("2. InsertionSort  for String");
			System.out.println("3. BubbleSort for String");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice = AlgorithmLogic.getInt();
			System.out.println();

			switch (choice) {
			case 1:
				start = System.currentTimeMillis();
				System.out.println("BinarySearch  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize1 = AlgorithmLogic.getInt();
				String array[] = AlgorithmLogic.input1DStringArray(arraySize1);
				System.out.println("The resultant array is :");
				AlgorithmLogic.bubble(array);
				System.out.println("Enter Key: ");
				String key = AlgorithmLogic.readString();
				int position1=AlgorithmLogic.binarySearch(array, key);
				if (position1 == -1) {
					System.out.println("Not Found");
				} else {
					System.out.println("Found at " + position1 + " position");
				}
				end = System.currentTimeMillis();
				elapsed = end - start;
				System.out.println("Total Elapsed Time is: " + elapsed);
				System.out.println();
				break;
			case 2:
				start = System.currentTimeMillis();
				System.out.println("InsertionSort  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize2 = AlgorithmLogic.getInt();
				String array2[] = AlgorithmLogic.input1DStringArray(arraySize2);
				System.out.println("Sorted Array is: ");
				 AlgorithmLogic.inserstionSort(array2);
				end = System.currentTimeMillis();
				elapsed = end - start;
				System.out.println("Total Elapsed Time is: " + elapsed);
				System.out.println();
				break;
			case 3:
				start = System.currentTimeMillis();
				System.out.println("BubbleSort  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize3 = AlgorithmLogic.getInt();
				String array3[] = AlgorithmLogic.input1DStringArray(arraySize3);
				System.out.println("Sorted Array is: ");
				 AlgorithmLogic.bubble(array3);
				end = System.currentTimeMillis();
				elapsed = end - start;
				System.out.println("Total Elapsed Time is: " + elapsed);
				System.out.println();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Input");
				break;
			}
		} while (ch < 5);
	}

}
