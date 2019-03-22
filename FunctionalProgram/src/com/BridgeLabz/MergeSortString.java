package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmLogic;
public class MergeSortString <T>
{
	public static void main(String[] args)
	{
		  System.out.println("Enter the value of arraySize: ");
	    	int arraySize= AlgorithmLogic.getInt();
		    String[]  array= new String[arraySize];
		    System.out.println("Enter Strings : ");
		     array = AlgorithmLogic.input1DStringArray(arraySize);
             AlgorithmLogic.mergeSort(array);
		       System.out.println("The sorted array is :");
		       
		        for (int i=0;i< array.length;i++)
		        {
		            System.out.println(array[i]);
		        }
	}
		     
	}



