 package com.bridgelabz.algorithmprograms;
import com.bridgelabz.common.utils.InputUtility;
public class BubbleSortInt 
{
	    static void bubbleSort(int arr[], int n) 
	    { 
	        int i, j, temp; 
	        boolean swapped; 
	        
	    } 
	    static void printArray(int arr[], int size) 
	    { 
	        int i; 
	        for (i = 0; i < size; i++) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	System.out.println("Enter the value of N: ");
	    	int N= InputUtility.readIntValues();
	    	int[] arr= new int[N];
	 
	    	System.out.println("Enter value to Elements");
	    	 for (int i = 0; i < N; i++)
	    	 {
	        for(int j=i+1;j<N;j++)
	        {
	        	if(arr[i]>arr[j])
	        	{
	 
	        	}
	        }
			arr[i] = InputUtility.readIntValues();
	    	 }
	        int n = arr.length; 
	        bubbleSort(arr, n); 
	        System.out.println("Sorted array: "); 
	        printArray(arr, n); 
	    } 
	} 
	  


