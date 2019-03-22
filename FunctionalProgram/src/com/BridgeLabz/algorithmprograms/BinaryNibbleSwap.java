package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmLogic;
public class BinaryNibbleSwap {
			static void showArr(int[] arr) 
			{
				for (int i = 0; i < arr.length; i++) 
				{
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			static boolean powerOf2(int n)
			{
				int i = 0, temp = (int) Math.pow(2, i);
				while (temp < n)
				{
					if (temp == n)
					{
						return true;
					}
					i++;
				}
				return false;
			}

			/**
			 * Function to swap nibbles in array
			 *
			 * @param int array to swap nibbles in array
			 * @return return swapped array
			 */
			static int[] swapNibbles(int[] arr) {
				// swap nibbles at first and last of the array
				// j is used for saving last 4 index of the array
				int temp, j = arr.length - 4;
				for (int i = 0; i < 4; i++)
				{ // loop runs 4 times and swap first four element to last four elements
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					j++;
				}
				return arr;
			}

			/**
			 * main function/method to test Binary class
			 *
			 * @param int array to swap nibbles in array
			 * @return return swapped array
			 */
			public static void main(String[] args) {

				try {
					Scanner s = new Scanner(System.in);
					System.out.println("enter a no");
					int[] binary =AlgorithmLogic.toBinary(s.nextInt());
					System.out.println("binary is ");
					showArr(binary);
					s.close();
					swapNibbles(binary);
					System.out.println("after swapping ");
					showArr(binary);
					int swapDec = AlgorithmLogic.toDecimal(binary);
					System.out.println("decimal of swapped binary is " + swapDec);

				

				} catch (Exception e) {
					System.out.println("enter input as integer ");
				}

			
		
	}

}
