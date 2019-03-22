package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class LeapYear {
			 
				public static void main(String[] args)
				{
			      System.out.println("enter the year"); 		 
				int year=FunctionalLogic.getInt();
				if(year>999)
				{
					boolean isLeap= FunctionalLogic.leapyear(year);
					if(isLeap==true)
				            System.out.println(year + " is a leap year.");
				        else
				            System.out.println(year + " is not a leap year.");		
			}
				else
					System.out.println("Enter 4 digit num");
		}
	}
		






