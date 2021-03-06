package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmLogic;

public class AnagramPalindrom {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		int start=0;
		int end=1000;
		
		lst=AlgorithmLogic.primeNumbers(start,end);
		
		List<String> new_lst=new ArrayList<String>(lst.size());
		
		for(Integer in:lst){
			new_lst.add(String.valueOf(in));
		}
		System.out.println(new_lst);
		
		Set<String> set=new HashSet<>();
		System.out.println("The prime numbers which are anagrams:");
		
		set=AlgorithmLogic.anagramPrime(new_lst);
		System.out.println(set);
		
		Set<String> pal_set=new HashSet<String>();
		System.out.println("The prime numbers which are palindrom");
		
		pal_set=AlgorithmLogic.palindromPrime(new_lst);
		System.out.println(pal_set);
		
		
		
	}
}