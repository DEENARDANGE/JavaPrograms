package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;
public class Questionnumber
{
		static int find() 
		{
			int low = 0, high = 127, mid;
			while (low != high) 
			{
				mid = (low + high) / 2;
				System.out.println("Enter 1 if no is between " + low + " - " + mid +
						         "\n Enter 2 if no is between " + (mid + 1) + " - " + high);
				int c=AlgorithmLogic.getInt();
				if (c == 1)
					high = mid;
				else
					low = mid + 1;
			}
			return low;
		}
		public static void main(String[] args)
		{
			System.out.println("guess a no between 0 to 127 ");
			AlgorithmLogic.getInt();
		   System.out.println("guessed no is " + find());
		}
}
