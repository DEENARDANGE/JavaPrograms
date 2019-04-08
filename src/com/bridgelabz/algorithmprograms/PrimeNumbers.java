package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmLogic;

public class PrimeNumbers {
		public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		int start=0;
		int end=1000;
		lst=AlgorithmLogic.primeNumbers(start,end);
		
		for(int i:lst)
			System.out.println(i);
		}
		
}