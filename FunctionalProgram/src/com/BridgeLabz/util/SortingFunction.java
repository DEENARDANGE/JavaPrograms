package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SortingFunction {
	//	Utility u=new Utility();
	StringTokenizer st;
		
		public SortingFunction(){
		}
		
		//Take 1D Array Input
		public static int[] input1DArray(int arraySize){
			int array[]=new int[arraySize];
			for(int i=0;i<arraySize;i++){
				System.out.println("Enter array["+i+"] : ");
				array[i]=AlgorithmLogic.getInt();
			}
			return array;
		}

		//Take 1D String Array Input
		public String[] input1DStringArray(int arraySize){
			String array[]=new String[arraySize];
			for(int i=0;i<arraySize;i++){
				System.out.println("Enter array["+i+"] : ");
				array[i]=AlgorithmLogic.readString();
			}
			return array;
		}

		//Print 1D array
		public static void print1DArray(int array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}
		
		//print 1D array String
		public static void print1DStringArray(String array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}

		//Binary Search
		public static int binarySearch(int[] inputArr, int key) {
	        int start = 0;
	        int end = inputArr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	                return mid;
	            }
	            if (key < inputArr[mid]) {
	               	end = mid - 1;
	            } else {
	               	start = mid + 1;
	            }
	        }
	        return -1;
	   	 }

		//Binary Search for String
		public int binarySearchString(String[] names, String key)
		{
	    	int first = 0;
	    	int last  = names.length;
	 
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

		//Bubble Sort for Integer
		public static int[] bubbleSort(int numbers[])
	   	 {
	        int temp;
	        for(int i = 0; i < numbers.length; i++)
	       	{
	            for(int j = 1; j < (numbers.length -i); j++)
	            {
	            	//if numbers[j-1] > numbers[j], swap the elements
	        		if(numbers[j-1] > numbers[j])
	    			{
	    				temp = numbers[j-1];
	   					numbers[j-1]=numbers[j];
	    				numbers[j]=temp;
	    			}
	   		 	}
	    	}
			return numbers;
		}

		//Bubble Sort for String
		public static String[] bubbleSortString(String numbers[])
	   	 {
	        String temp;
	        for(int i = 0; i < numbers.length; i++)
	       	{
	            for(int j = 1; j < (numbers.length -i); j++)
	            {
	            	//if numbers[j-1] > numbers[j], swap the elements
	        		if(numbers[j-1].compareTo(numbers[j])<0)
	    			{
	    				temp = numbers[j-1];
	   					numbers[j-1]=numbers[j];
	    				numbers[j]=temp;
	    			}
	   		 	}
	    	}
			return numbers;
		}

		//Insertion sort
		public static int[] insertionSort(int words[]){
			int temp;
			for(int i=1;i<words.length;i++){
				for(int j=i;j>0;j--){
					if((words[j]-words[j-1])<0){
						temp=words[j];
						words[j]=words[j-1];
						words[j-1]=temp;
					}
					else
						break;
				}
			}
			return words;
		}
		
		//Insertion sort for String
		public static String[] insertionSortString(String words[]){
			String temp;
			for(int i=1;i<words.length;i++){
				for(int j=i;j>0;j--){
					if(words[j].compareTo(words[j-1])<0){
						temp=words[j];
						words[j]=words[j-1];
						words[j-1]=temp;
					}
					else
						break;
				}
			}
			return words;
		}
		
		//Take Statement And return Array of words
		public String[] wordsArrayFromStatement(String statement)
		{	
			st=new StringTokenizer(statement," ");
			String words[]=new String[st.countTokens()];
			int i=0;
			while(st.hasMoreTokens()){
				words[i]=st.nextToken();
				i++;
			}
			return words;
		}

		public static int inputInteger() {
			BufferedReader br = null;
			try{
				try{	
					return Integer.parseInt(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
	
			return 0;
		}

		//take input word
		public String inputString(){
			BufferedReader br = null;
			try{
				return br.readLine();
			}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return "";
		}

	}


