package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmLogic;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
					System.out.println("enter size of array");
					int[] arr = new int[s.nextInt()];
					System.out.println("enter elements");
					for (int i = 0; i < arr.length; i++) {
						arr[i] = s.nextInt();
					}
					System.out.println("enter element to search ");
					int n = s.nextInt();
					int f = AlgorithmLogic.binary(arr, n);
					if (f > 0)
						System.out.println("element found at index" + f);
					else
						System.out.println("not found");
				
					System.out.println("enter correct input is integer ");
				
			}
		}
		
