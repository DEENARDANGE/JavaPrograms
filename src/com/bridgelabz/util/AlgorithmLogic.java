package com.bridgelabz.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
//***************************Anagram*************************//
	/**
	 *Static function to check if the two strings are anagram or not.
	 * @param <T>
	 * 
	 * @param str1 the string to be checked for anagram
	 * @param str2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean isAnagram(String str1,String str2) {
		char[] array1=str1.toCharArray();
		char temp1,temp2;
		char[] array2=str2.toCharArray();
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			return false;
		}
		else{
			for(int i=0;i<len1;i++){
				for(int j=0;j<len1-1;j++){
					if(array1[j]>array1[j+1]){
						temp1=array1[j];
						array1[j]=array1[j+1];
						array1[j+1]=temp1;
					}
				}
			}
			for(int i=0;i<len2;i++){
				for(int j=0;j<len2-1;j++){
					if(array2[j]>array2[j+1]){
						temp2=array2[j];
						array2[j]=array2[j+1];
						array2[j+1]=temp2;
					}
				}
			}
			str1=String.valueOf(array1);
			str2=String.valueOf(array2);
			if(str1.equals(str2))
				return true;
			else
				return false;
		}	
	}
	//********************************prime number*************************//
	/**
	 *static function to print the prime numbers for the given range
	 * 
	 * @param m the integer that represents the lower bound of the range
	 * @param n the integer that represents the upper bound of the range
	 * @return list of integers that are prime numbers between the range
	 */
	public static List<Integer> primeNumbers(int start,int end) {
		List<Integer> lst=new ArrayList<Integer>();
		int flag=1;
		for(int i=start+2;i<end;i++){
			for(int j=2;j<i;j++){
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				lst.add(i);
			}
		}
		return lst;
	}
	//*******************************Anagram and prime number****************//
	/**
	 * static function that is used to add prime numbers that are
	 * anagram 
	 * 
	 * @param new_lst the list of prime numbers 
	 * @return set of prime numbers that are anagram
	 */
	public static Set<String> anagramPrime(List<String> new_lst){
		Set<String> set=new HashSet<>();
		for(int i=0;i<new_lst.size();i++){
			for(int j=i+1;j<new_lst.size();j++){
				if(isAnagram(new_lst.get(i), new_lst.get(j))){
					set.add(new_lst.get(i));
					set.add(new_lst.get(j));
					System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
				}
			}
		}
		return set;
	}
	//**************************palindrome and prime number***********************//
	/**
	 * static function that is used to add prime numbers that are 
	 * anagram and palindrom
	 * 
	 * @param set the set of prime numbers that are anagram
	 * @return set the set of prime numbers that are anagram and palindrom
	 */
	public static Set<String> palindromPrime(List<String> new_lst){
		Set<String> pal_set=new HashSet<>();
		Iterator<String> itr=new_lst.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(isPalindrom(str)){
				pal_set.add(str);
			}
		}
		return pal_set;
	}
	//***********************palindrome****************************//
	/**
	 * static function that is used to check if the passed string 
	 * is a palindrom or not 
	 * 
	 * @param str the string that is to be checked if it is a palindrom 
	 * 				or not
	 * @return true if the string is palindrom else false
	 */
	public static boolean isPalindrom(String str){
		char temp;
		int begin=0;
		int end=str.length()-1;
		String rev_str=str;
		char[] array=str.toCharArray();
		while(begin<=end){
			temp=array[begin];
			array[begin]=array[end];
			array[end]=temp;
			begin++;
			end--;
		}
		String new_str=String.valueOf(array);
		if(rev_str.equals(new_str))
			return true;
		else
			return false;
	}
	
//************************decimal to binary**************//

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
//*************************string to array*********************//
	
	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
//***************************************decimal to binary***********************//
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

	
	//********************************************print array***********************//
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
