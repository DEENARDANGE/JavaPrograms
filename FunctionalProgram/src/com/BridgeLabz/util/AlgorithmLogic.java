package com.bridgelabz.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AlgorithmLogic
{
	static Scanner Scanner = new Scanner(System.in);
	public static int getInt() {
		return Scanner.nextInt();
	}
	public static Double getDouble() {
		return Scanner.nextDouble();
	}
	public static String readString() {
		return Scanner.next();
	}
	

	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isAnagram(char[] ch1, char[] ch2) 
	{
		int length1 = ch1.length;
		int length2 = ch2.length;

        if (length1  != length2)
			return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < length1 ; i++)
			if (ch1[i] != ch2[i])
				return false;

		return true;

	}

	/**
	 * @param s
	 * @return
	 */
	
	public static int[] count(String s) {
		s = s.toLowerCase();
		int[] c = new int[25];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 97]++;
		}
		return c;
	}

	/**
	 * @param n
	 * @return
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	/**
	 * to check the values are anagrams or not
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean anagram(int n1, int n2)

	{
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Function to print the prime no between to 1 to 1000
	 */
	 public static void prime() {
	 System.out.println();
	 boolean b;
	 for (int j = 2; j <= 1000; j++) {
	 b = true;
	 for (int i = 2; i < j / 2; i++) {
	 if (j % i == 0) {
	 b = false;
	 break;
	 }
	 }
	 if (b)
	 System.out.print(j + " ");
	 }
	 }

	/**
	 * function to chekc if given no is prime or not
	 * 
	 * @param n
	 *            thenumber which to check for prime
	 * @return true if prime false if not
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Function helping prime() to check if prime is pallindrome and print it
	 */
	public static void primePallindrome() {
		 System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
	}

	/**
	 * Function to check if no is anagram or not
	 */
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
	}

	
	/**
	 * @param n
	 * @return
	 */
	public static boolean isPallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}

	// Function to sort implementing bubble sort algorithm//

	/**
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		return arr;
	}

	// Function to sort string array using bubble sort algorithm//

	/**
	 * @param arr
	 */
	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	// Function to search a number in a array using binary search algorithm//

	/**
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int binary(int[] arr, int n)
	{
		int high = arr.length - 1, low = 0, mid;
		arr = bubbleSort(arr);

		while (low <= high) 
		{
			mid = (low + high) / 2;
			if (n == arr[mid])
			{
				return mid;
			} 
			else if (arr[mid] < n) 
			{
				low = mid + 1;
			} 
			else 
			{
				high = mid - 1;
			}
		}
		return -1;
	}

	// Function to search a string in string array using binary search//

	/**
	 * @param arr
	 * @param s
	 * @return
	 */
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s.equalsIgnoreCase(arr[mid])) 
			{
				return mid;
			}
			else if (arr[mid].compareToIgnoreCase(s) < 0)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return -1;
	}

	// Function to sort array using insertion sort//

	/**
	 * @param arr
	 */
	public static void insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp)
			{
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
	}

	// Function to sort array using insertion sort//

	/**
	 * @param arr
	 * @return
	 */
	public static String[] insertionSort(String[] arr) 
	{
		for (int i = 1; i < arr.length; i++) 
		{
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(temp) < 0)
			{
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	/**
	 * @param arraySize
	 * @return
	 */
	public static int[] input1DArray(int arraySize)
	{
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++)
		{
			System.out.println("Enter array[" + i + "] : ");
			array[i] = getInt();
		}
		return array;
	}

	// Print 1D array

	/**
	 * @param array
	 */
	public static void input1DArray(int array[]) 
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// Function to convert decimal to binary//
	/**
	 * @param d
	 * @return
	 */
	public static int[] toBinary(int d)
	{
		String bin = "";
		while (d != 0)
		{
			bin = (d % 2) + bin;
			d /= 2;
		}
		
		while (bin.length() % 4 != 0) 
		{
			bin = 0 + bin;
		}
		return stringToIntArray(bin);

	}

	// Function to convert string to int array helper function for swapnibble in//

	/**
	 * @param bin
	 * @return
	 */
	static int[] stringToIntArray(String bin)
	{
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++)
		{
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	// Function to convert binary to decimal//
	/**
	 * @param binary
	 * @return
	 */
	public static int toDecimal(int[] binary)
	{
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) 
		{
			if (binary[i] == 1)
			{
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

	}
}
