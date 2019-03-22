package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Gambler {
	public static void main(String[] args) {
		System.out.println("enter the num of Stake, goal , trials");
		int Stake = FunctionalLogic.getInt();
		int goal = FunctionalLogic.getInt();
		int trials = FunctionalLogic.getInt();
		FunctionalLogic.game(Stake, goal, trials);
	}
}
