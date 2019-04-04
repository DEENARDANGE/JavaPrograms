package com.bridgelabz.datastructure;

import com.bridgelabz.util.AlgorithmLogic;
import com.util.datastructure.DataStructureLogic;
import com.util.datastructure.Queue;

public class Banking {

	public static void main(String[] args) {
		int curBalance = 10000;
		double amount = 0;
		@SuppressWarnings("unused")
		boolean notDone = true;
		Queue<Integer> d = new Queue<Integer>();
		while (d.capacity > 0) {
			d.enque(d.capacity);
			System.out.println();
			System.out.println("------------Banking Cash Counter-----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			int answer = AlgorithmLogic.getInt();
			switch (answer) {
			case 1:
				System.out.println("How much do you want to deposit? ");
				amount = AlgorithmLogic.getDouble();
				System.out.println(amount);
				curBalance = DataStructureLogic.Deposit(amount, curBalance);
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
					curBalance =DataStructureLogic.Withdrawal(amount, curBalance);
					System.out.println("Your Withdrawal is: " + amount);
					System.out.println("Your Balance is: " + curBalance);
					break;
				}
			case 3:
				DataStructureLogic.checkBalance(curBalance);
				break;
			case 4:
				notDone = false;
				int c = d.deque();
				System.out.println("The Number of People in Queue is: " + c);
				break;
			default:
				System.out.println("Not Valid input, try again.");
				break;
			}
		}
		System.out.println("Thank you and have a nice day!");
	}

	

}
