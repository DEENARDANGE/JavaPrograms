package com.bridgelabz.datastructure;
import java.util.ArrayList;
import java.util.List;
import com.util.datastructure.DataStructureLogic;
import com.util.datastructure.QueueLinkedList;

public class PrimeAnagramQueue {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using queue
	*/
	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		
			QueueLinkedList<T> queue=new QueueLinkedList<T>();
			List<Integer> primenumber = new ArrayList<Integer>();
			primenumber = DataStructureLogic.primeNumbers(0,1000); //finding prime
			queue =  DataStructureLogic.primeAnagram2(primenumber); //finding anagram
			System.out.println(queue.getSize()+" is the size of queue");
			System.out.println("Elements in a queue are :");
			while(!queue.isQueueEmpty())
			{
				queue.remove();
				queue.remove();
				System.out.println();
			}
	}
}