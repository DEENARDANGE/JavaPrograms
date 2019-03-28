package com.bridgelabz.datastructure;

import com.bridgelabz.util.AlgorithmLogic;

public class Banking {

	public static void main(String[] args) {

		int curBalance = 0;
		double amount = 0;
		boolean notDone = true;

		while (notDone) {
			System.out.println();
			System.out.println("------------Banking Cash Counter-----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance ");
			System.out.println("4.Exit");
			//System.out.println("5.Number of people in the Queue ");
			System.out.println();
			System.out.println("Enter your choice: ");

			int answer = AlgorithmLogic.getInt();
			switch (answer) {
			case 1:
				System.out.println("How much do you want to deposit? ");
				amount = AlgorithmLogic.getDouble();
				System.out.println(amount);
				curBalance = Deposit(amount, curBalance);
				System.out.println("Your Deposit is: " + amount);
				System.out.println("Your Balance is: " + curBalance);
				break;
			case 2:
				System.out.println("How much do you want to withdraw? ");
				amount = AlgorithmLogic.getDouble();
				System.out.println(amount);
				if (amount > curBalance) {
					System.out.println("You cannot overdraw your account.Try again.");
					break;
				} else {
					curBalance = Withdrawal(amount, curBalance);
					System.out.println("Your Withdrawal is: " + amount);
					System.out.println("Your Balance is: " + curBalance);
					break;
				}
				
			case 3:
				checkBalance(curBalance);
				break;
			case 4:
				notDone = false;
				
				break;
			
			default:
				System.out.println("Not Valid input, try again.");
				break;
			}
		
			int j=getSize();
			System.out.println("The Number of People in Queue is: "+j);			
		}

		System.out.println("Thank you and have a nice day!");

	}

	private static int getSize() {
		        int size = 0;
		        size++;
				return size;
		    }    
		    
	

	public static int Deposit(double amount, int curBalance) {
		curBalance += amount;
		return curBalance;
	}

	public static int Withdrawal(double amount, int curBalance) {
		curBalance -= amount;
		return curBalance;
	}

	public static void checkBalance(int curBalance) {
		System.out.println("Your current balance is: " + curBalance);
	}

}
