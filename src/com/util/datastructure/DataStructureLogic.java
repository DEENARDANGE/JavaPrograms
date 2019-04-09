package com.util.datastructure;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmLogic;
public class DataStructureLogic {
//	
	
	//********************* Balanced parantesis****************//
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	@SuppressWarnings("unchecked")
	public static boolean areParenthesisBalanced(char[] ch) {
			@SuppressWarnings("rawtypes")
			StackImplementation st = new StackImplementation();
	
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
					st.push(ch[i]);
	
				else	if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
	
					if (st.isEmpty()) {
						return false;
					}
	
					else if (!isMatchingPair((char)st.pop(), ch[i])) {
						return false;
					}
				}
	
			}
	
			if (st.isEmpty())
				return true;
			else {
				return false;
			}
		} 
	
//*********************calender************//
	 public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	 // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }

	//******************************************************************************************************************//

		/**
		 * to find number of total number of BST that can be performed
		 * @param n double type
		 * @return double type result 
		 */
		public static double binaryCount(int n) {
			double c = binomialCoeff(2 * n, n);
			double count = c / (n + 1);
			return count;
	}
		/**
		 * to find out binomial co-efficient of number
		 * @param n double type number
		 * @param k double type number
		 * @return double type result
		 */
		public static double binomialCoeff(double n, double k) {
			int res = 1;
		    if (k > n - k) 
		        k = n - k;  
			for (int i = 0; i < k; i++) {
				res *= (n - i);
				res /= (i + 1);
			}
			return res;
		
	}
		
//*******************************************************//
/**
 * Function that checks if the prime numbers are anagram or not
 * 
 * @param new_lst the list of prime numbers 
 * @return the list of prime numbers that are anagram
 */
	public static List<Integer> anagramPrime(List<Integer> new_lst){
	List<Integer> listOfAnagrams=new ArrayList<Integer>();
	for(int i=0;i<new_lst.size();i++){
		for(int j=i+1;j<new_lst.size();j++){
			if(AlgorithmLogic.isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
				listOfAnagrams.add(new_lst.get(i));
				listOfAnagrams.add(new_lst.get(j));
				System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
			}
		}
	}
	return listOfAnagrams;
}

/**
 * Function that prints the list of prime numbers that are anagram 
 * 
 * @param list of prime numbers that anagram 
 */
public static void printPrimeAndAnagram(List<List<Integer>> list)
{
    List<Integer> aList = new ArrayList<Integer>();
    for (int i = 0; i < list.size(); i++) {
        aList = list.get(i);
        if (i == 0) {
            System.out.println("Numbers which are prime and anagram are:"+aList.size());
            System.out.println();
            for (int j = 0; j < aList.size(); j++) {
                System.out.print(aList.get(j) + " ");
            }
        } else {
            System.out.println("Numbers which are prime but not anagram are:"+aList.size());
            System.out.println();
            for (int j = 0; j < aList.size(); j++) {
                System.out.print(aList.get(j) + " ");
            }
        }
        System.out.println();
    }
}
}
		

			
	
  	
