package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.List;

import com.util.datastructure.DataStructureLogic;
import com.util.datastructure.StackImplementation;

public class PrimeAnagramStack {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using stack
	*/
	public static void main(String[] args) {
		StackImplementation<Integer> stack=new StackImplementation<Integer>();
		List<Integer> primenumber = new ArrayList<Integer>();
	        primenumber = DataStructureLogic.primeNumbers(0,1000); 
	        stack =  DataStructureLogic.primeAnagram1(primenumber); 
	        System.out.println(stack.size()+" is the size of the stack");
	    	System.out.println("Printing the elements in reverse order using pop function of stack");
	    	while(!stack.isEmpty())
	    	{
	    		System.out.println(stack.pop()+" "+stack.pop());
	    	}
	    }

	}
