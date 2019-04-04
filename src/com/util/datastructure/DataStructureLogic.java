package com.util.datastructure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
	
	// ********************Banking *****************//

	public static int Deposit(double amount, int curBalance) {
		curBalance += amount;
		return curBalance;
	}

	public static int Withdrawal(double amount, int curBalance) {
		curBalance -= amount;
		return curBalance;
	}

	public static void checkBalance(int curBalance) {
		System.out.println("Your current balance is: " + curBalance);
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

//*********************PrimeNum********************//
  		/**
  		 *static function to print the prime numbers for the given range
  		 * 
  		 * @param m the integer that represents the lower bound of the range
  		 * @param n the integer that represents the upper bound of the range
  		 * @return list of integers that are prime numbers between the range
  		 */
  		public static List<Integer> primeNumbers(int m,int n) {
  			List<Integer> lst=new ArrayList<Integer>();
  			int temp;

  			//swapping of bounds if the given lower bound is greater than upper bound
  			if(m>n) {
  				temp=m;
  				m=n;
  				n=temp;}
  			int flag=1;
  			//try all the possible values from lower bound to upper bound
  			//if the number has the factor then it must be checked within lower bound
  			for(int i=m;i<=n;i++){
  				for(int j=2;j<i;j++){
  					//If the number is divisible by any of the number then 
  					//initializing flag to zero and break
  					//else flag is initialized to one
  					if(i%j==0){
  						flag=0;
  						break;}
  					else
  						flag=1;}
  				//If the number is prime which is indicated by the flag,
  				//then adds the number into an ArrayList.
  				if(flag==1)
  					lst.add(i);}
  			return lst;}

  		/**
		 * to find prime number which are anagram
		 * @param primeList is list of integers
		 * @return set of integers
		 */
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}

	/**
	 *Static function to check if the two strings are anagram or not.
	 * 
	 * @param str1 the string to be checked for anagram
	 * @param str2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean isAnagram(String word, String anagram) {
		boolean isAnagram = false;
		if (word != null && anagram != null && word.length() == anagram.length()) {
			char[] arr = word.toCharArray();
			StringBuilder temp = new StringBuilder(anagram);
			//int wordLength = FunctionalUtility.readInteger();
			for (char ch : arr) {
				int index = temp.indexOf("" + ch);
				if (index != -1) {
					temp.deleteCharAt(index);
				}
			}
			isAnagram = temp.toString().isEmpty();
		}
		return isAnagram;
	}
	/**
	 * to find prime numbers which are anagram and store in stack
	 * @param primeList is list of integers
	 * @return stack of integers
	 */
	@SuppressWarnings("unchecked")
	public static StackImplementation<Integer> primeAnagram1(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (StackImplementation<Integer>) primeAnagram;
	}
	/**
	 * to find prime numbers which are anagram and store in queue
	 * @param primeList is list of integers
	 * @return queue of integers
	 */
	@SuppressWarnings("rawtypes")
	public static QueueLinkedList primeAnagram2(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (QueueLinkedList) primeAnagram;
	}

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
			for (int i = 0; i < k; ++i) {
				res *= (n - i);
				res /= (i + 1);
			}
			return res;
		
	}
		}

		

			
	
  	
