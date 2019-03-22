package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class Task {
	public static void main(String[] args) {
		System.out.println("Enter no of task");
		int tasks = AlgorithmLogic.getInt();
		int[] dead = new int[tasks];
		int[] min = new int[tasks];
		for (int i = 0; i < min.length; i++) {
			System.out.println("Time to complite the task");
			min[i] = AlgorithmLogic.getInt();
			System.out.println("task " + i + " time");
			System.out.println("Deadline to complite the task");
			dead[i] = AlgorithmLogic.getInt();
			System.out.println("task " + i + " deadline");

		}

	}

}
