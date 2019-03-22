package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(" Enter the value to convert Binary  : ");
		int[] binary = AlgorithmLogic.toBinary(AlgorithmLogic.getInt());
		System.out.println("Binary is ");
		AlgorithmLogic.showArr(binary);
	}

}
