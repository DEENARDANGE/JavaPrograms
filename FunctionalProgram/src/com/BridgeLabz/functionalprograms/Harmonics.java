package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Harmonics {
		public static void main(String[] args) 
		{
			System.out.println("enter the num"); 		 
			int num=FunctionalLogic.getInt();
			if(num!=0)
		   	 {
			float harmonics = FunctionalLogic.harmonicsofnum(num);
			System.out.println(harmonics);
		   	}
		    else
		    	System.out.println("Num should be non zero ,sEnter valid num ");
		    
		}
	}



