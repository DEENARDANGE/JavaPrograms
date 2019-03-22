package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class StopWatch {
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(start);
		long now = System.nanoTime();
		System.out.println(now);
		double time = FunctionalLogic.stopwatch(now, start);
		System.out.println("time  elaapse =" + time);
	}
}
