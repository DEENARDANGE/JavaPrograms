 package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmLogic;
public class BubbleSortInt <T>
{
	
	public static void main(String[] args) 	{
	System.out.println("Enter number of elements to be sorted: ");
	int arraySize=AlgorithmLogic.getInt();
	String arr[]=AlgorithmLogic.input1DStringArray(arraySize);
	AlgorithmLogic.bubble(arr);
}
}


