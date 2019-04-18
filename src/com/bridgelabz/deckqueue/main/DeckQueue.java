package com.bridgelabz.deckqueue.main;

import com.bridgelabz.deckqueue.impl.DeckQueueImpl;
import com.bridgelabz.deckqueue.intrfac.DeckQueueInter;

public class DeckQueue {
	 public static void main(String[] args) {
		 DeckQueueInter deckQueueImpl=new DeckQueueImpl();
	    	deckQueueImpl.intializeCard();
	    	deckQueueImpl.shuffleCard();
			deckQueueImpl.deckQueueStore();
			deckQueueImpl.displayDeck();
	    
	    }

}
