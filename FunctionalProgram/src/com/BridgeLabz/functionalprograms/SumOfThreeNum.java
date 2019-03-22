package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class SumOfThreeNum {
		public static void main(String[] args)
		{
					System.out.println("enter the n"); 		 
					int n=FunctionalLogic.getInt();
			     boolean sum= FunctionalLogic.findTriplets(n); 
			     if(sum)
			     System.out.println("Not found ");  
		}
	}



