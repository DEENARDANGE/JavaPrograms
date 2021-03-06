package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class BinaryNibbleSwap {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a NUM");
			int[] binary = AlgorithmLogic.toBinary(AlgorithmLogic.getInt());
			System.out.println("Binary is ");
			AlgorithmLogic.showArr(binary);
			AlgorithmLogic.swapNibbles(binary);
			System.out.println("After swapping ");
			AlgorithmLogic.showArr(binary);
			int swapDec = AlgorithmLogic.toDecimal(binary);
			System.out.println("Decimal of swapped binary is " + swapDec);

		} catch (Exception e) {
			System.out.println("Enter input as integer ");
		}
	}
}
