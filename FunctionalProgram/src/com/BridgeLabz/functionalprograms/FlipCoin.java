package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class FlipCoin {
		public static void main(String[] args) 
		{
			System.out.println("enter the num of flips"); 		 
			int flips=FunctionalLogic.getInt();
			  FunctionalLogic.toss(flips);
		}
	}



