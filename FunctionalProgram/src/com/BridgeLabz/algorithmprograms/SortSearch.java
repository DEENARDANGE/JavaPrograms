package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

import com.bridgelabz.util.AlgorithmLogic;

//Providing functionality related to Array
//1: Read string and int array.
//2: Display string and int array
//3: sorting algo (bubble, insertion sort, binary search)
//4: Statement to array of word	 
public class SortSearch {
		public static long start=0;
		public static long end=0;
		public static long elapsed;
		static int ch=0;
		
		public static void main(String[] args)
		{
			//SortingFunction sf=new SortingFunction();
			//Utility u=new Utility();
		
			do
			{ 
				System.out.println("--------Menu for Searching and Sorting----------");
				System.out.println("1. BinarySearch  for Integer");
				System.out.println("2. BinarySearch  for String");
				System.out.println("3. InsertionSort  for Integer");
				System.out.println("4. InsertionSort  for String");
				System.out.println("5. BubbleSort for Integer");
				System.out.println("6. BubbleSort for String");
				System.out.println("7. Exit");
				System.out.println();
				System.out.println("Enter Your Choice:");
				int choice=AlgorithmLogic.getInt();
				//int choice=inputInteger();
				System.out.println();
		
				switch (choice) 
				{ 
				case 1:
						start=System.currentTimeMillis();
						System.out.println("BinarySearch  For Integer");
						System.out.println("Enter size: ");
						int arraySize=AlgorithmLogic.getInt();
						int a[]=input1DArray(arraySize);
						Arrays.sort(a);
						print1DArray(a);
						System.out.println("Enter Key: ");
						int position=binarySearch(a,AlgorithmLogic.getInt());

						if(position==-1)
						{
							System.out.println("Not Found");
						}
						else
						{
							System.out.println("Found at "+position+" position");
						}
						end=System.currentTimeMillis();
						elapsed=end-start;
						System.out.println("Total Elapsed Time is: "+elapsed);
						break;
				case 2:
						start=System.currentTimeMillis();
						System.out.println("BinarySearch  For String");
						System.out.println("Enter number of words to be sorted: ");
						int arraySize1=AlgorithmLogic.getInt();
						String b[]=input1DStringArray(arraySize1);
						Arrays.sort(b);
						print1DStringArray(b);
						System.out.println("Enter Key: ");
						int position1=binarySearchString(b,AlgorithmLogic.readString());

						if(position1==-1)
						{
							System.out.println("Not Found");
						}
						else
						{
							System.out.println("Found at "+position1+" position");
						}
						end=System.currentTimeMillis();
						elapsed=end-start;
						System.out.println("Total Elapsed Time is: "+elapsed);
						break;
				case 3:
						start=System.currentTimeMillis();
						System.out.println("InsertionSort  For Integer");
						System.out.println("Enter size: ");
						int arraySize5=AlgorithmLogic.getInt();
						int c[]=input1DArray(arraySize5);
						print1DArray(c);
						System.out.println("Enter Key: ");
						int k[]=insertionSort(c);
						System.out.println("Sorted Array is: ");

						for(int i=0;i<k.length;i++)
						{
							System.out.println(k[i]);
						}

						end=System.currentTimeMillis();
						elapsed=end-start;
						System.out.println("Total Elapsed Time is: "+elapsed);
						break;
				case 4 :
						start=System.currentTimeMillis();
						System.out.println("InsertionSort  For String");
						System.out.println("Enter number of words to be sorted: ");
						int arraySize4=AlgorithmLogic.getInt();
						String d[]=input1DStringArray(arraySize4);
						print1DStringArray(d);
						System.out.println("Enter Key: ");
						String k1[]=insertionSortString(d);
						System.out.println("Sorted Array is: ");

						for(int i=0;i<k1.length;i++)
						{
							System.out.println(k1[i]);
						}
						end=System.currentTimeMillis();
						elapsed=end-start;
						System.out.println("Total Elapsed Time is: "+elapsed);
						break;
				case 5:
						start=System.currentTimeMillis();
						System.out.println("BubbleSort  For Integer: ");
						System.out.println("Enter size: ");
						int arraySize2=AlgorithmLogic.getInt();
						int e[]=input1DArray(arraySize2);
						print1DArray(e);
						System.out.println("Enter Key: ");
						int k2[]=bubbleSort(e);
						System.out.println("Sorted Array is: ");

						for(int i=0;i<k2.length;i++)
						{
							System.out.println(k2[i]);
						}
						end=System.currentTimeMillis();
						elapsed=end-start;
						System.out.println("Total Elapsed Time is: "+elapsed);
						break;
				case 6:
						start=System.currentTimeMillis();
						System.out.println("BubbleSort  For String");
						System.out.println("Enter number of words to be sorted: ");
						int arraySize3=AlgorithmLogic.getInt();
						String f[]=input1DStringArray(arraySize3);
						print1DStringArray(f);
						System.out.println("Enter Key: ");
						String k3[]=bubbleSortString(f);
						System.out.println("Sorted Array is: ");

						for(int i=0;i<k3.length;i++)
						{
							System.out.println(k3[i]);
						}
						end=System.currentTimeMillis();
						elapsed=end-start;
						System.out.println("Total Elapsed Time is: "+elapsed);
						break;
				case 7: 
						System.exit(0);
				default:
						System.out.println("Wrong Input");
						break;
				}
			}
			while(ch<8);
		}
	
	static BufferedReader br;
		//Utility u=new Utility();
		StringTokenizer st;
		
		public void SortingFunction(){
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
		public static String[] input1DStringArray(int arraySize){
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
		public static int binarySearchString(String[] names, String key) {
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
		public String[] wordsArrayFromStatement(String statement){	
			st=new StringTokenizer(statement," ");
			String words[]=new String[st.countTokens()];
			int i=0;
			while(st.hasMoreTokens()){
				words[i]=st.nextToken();
				i++;
			}
			return words;
		}
	}


