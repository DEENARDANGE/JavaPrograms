package com.bridgelabz.datastructure;
import com.bridgelabz.util.AlgorithmLogic;
import com.util.datastructure.Node;

public class PalindromeChecker {
	public static void main(String[] args) {
		Node<Character> node = new Node<Character>();

		System.out.println("Enter a String: ");
		String input = AlgorithmLogic.readString();

		// adding each character to the rear of the dequeue
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
		    node.addRear(character);
		}
		int flag = 0;

		while (node.size > 1) {
			if (node.removeFront() != node.removeRear()) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}