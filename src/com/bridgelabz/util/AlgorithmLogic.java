package com.bridgelabz.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmLogic {
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

	// anagram//
	public static boolean isAnagram(char[] ch1, char[] ch2) {
		int length1 = ch1.length;
		int length2 = ch2.length;

		if (length1 != length2)
			return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < length1; i++)
			if (ch1[i] != ch2[i])
				return false;

		return true;

	}

	// count char //

	public static int[] count(String s) {
		s = s.toLowerCase();
		int[] c = new int[25];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 97]++;
		}
		return c;
	}

	// count int //
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

	// anagram //
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
	
	// prime num //
	public static void primenum() {
		String primeNumbers = "";
		for (int i = 0; i <= 1000; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println(primeNumbers);
	}


	// prime //
	public static void prime() {
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

	
//	// is prime//
//	public static boolean isPrime(int n) {
//		for (int i = 2; i < n / 2; i++) {
//			if (i % n == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	// prime pallindrom //
	public static void primePallindrome() {
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

	//  Prime anagram //
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
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

	// palindrom //
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

	//decimal to binary //
	
	public static int[] toBinary(int number) {
		String bin = "";
		while (number != 0) {
			bin = (number % 2) + bin;
			number /= 2;
		}

		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);

	}

	// string to binary//
	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	//binary to decimal //
	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

	}

	
	
	// print array//
	public static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	
	
	// swap nibble //
	public static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	
	// decimal to binary //
	public static void convertBinary(int decimalValue) {
		{
			int b[] = new int[40];
			int index = 0;
			while (decimalValue > 0) {
				b[index++] = decimalValue % 2;
				decimalValue = decimalValue / 2;
			}
			System.out.println("The binary converted value is :");
			for (int i = index - 1; i >= 0; i--) {
				System.out.print(b[i]);
			}
		}

	}
	
	
	
	
// input //
	public static String[] input1DStringArray(int arraySize) {
		String array[] = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter array[" + i + "] : ");
			array[i] = AlgorithmLogic.readString();
		}
		return array;

	}

	// Bubble sort
	public static <T extends Comparable<T>> T[] bubble(T[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[i].compareTo(array[j]) < 0) {

					T temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}

			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;

	}

	// Insertion sort

	public static <T extends Comparable<T>> T[] inserstionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					T temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else
					break;
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;
	}

	// Binary Search for String
	public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (key.compareTo(array[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(array[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// MergeSort

	public static <T extends Comparable<T>> T[] mergeSort(T[] array) {

		if (array.length >= 2) {
			String[] left = new String[array.length / 2];
			String[] right = new String[array.length - array.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = (String) array[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = (String) array[i + array.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(array, left, right);
		}
		return array;
	}

	@SuppressWarnings("unchecked")
	private static <T extends Comparable<T>> void merge(T[] array, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				array[i] = (T) left[a];
				a++;
			} else {
				array[i] = (T) right[b];
				b++;
			}
		}

	}

	// Binary Search for String

	public static int binarySearchfile(String[] names, String key) {
		int first = 0;
		int last = names.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(names[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(names[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// file read//
	public static String[] fileRead(File file) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(file);
		int line;
		while ((line = fr.read()) != -1) {
			if (line == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) line);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	public static void permute(String s, int n, int r) {
		if (n == r)
			System.out.println(s);
		else {
			for (int i = n; i <= r; i++) {
				s = swap(s, n, i);
				permute(s, n + 1, r);
				s = swap(s, n, i);
			}
		}

	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] ch = a.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}

				
	
}
