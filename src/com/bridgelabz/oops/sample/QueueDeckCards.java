package com.bridgelabz.oops.sample;

import com.bridgelabz.util.AlgorithmLogic;
import com.util.datastructure.Queue;

public class QueueDeckCards {
	
	/*
	* The main function is written to distribute deck of cards 
	* which are shuffled among 4 players
	*/
	public static void main(String[] args) {
		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int n = Suits.length * Ranks.length;
		String[] deck = new String[n];
		for (int i = 0; i < Ranks.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = Ranks[i] + " " + Suits[j];
			}
		}
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		Queue<Queue<String>> mainQueue =deckQueueStore(deck);
		displayDeck(mainQueue);
	}
	
	public static Queue<Queue<String>> deckQueueStore(String[] deck) {
		Queue<Queue<String>> mainQueue = new Queue<Queue<String>>();
		Queue<String> Queue = new Queue<String>();
		System.out.println("Total number of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}
			String[] str2 = AlgorithmLogic.bubble(demo);
			for (int k = 0; k < str2.length; k++) {
				Queue.insert(str2[k]);
			}
			mainQueue.insert(Queue);
			Queue = new Queue<String>();
			continue;
		}
		return mainQueue;
	}

	/**
	 * Function to display the deck of cards using queue 
	 * 
	 * @param mainQueue
	 */
	public static void displayDeck(Queue<Queue<String>> mainQueue) {
		for (int i = 0; i < mainQueue.getSize(); i++) {
			Queue<String> queue2 = mainQueue.remove();
			System.out.println("---------------------------------------- Person " + (i + 1)
					+ " -------------------------------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.remove() + " ");
			}
			System.out.println();
		}
	}
}