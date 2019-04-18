package com.bridgelabz.deck.main;

import com.bridgelabz.deck.impl.DeckImpl;
import com.bridgelabz.deck.intrfac.DeckInterface;

public class Deck {
    public static void main(String[] args) {
    	
    	DeckInterface deckImpl=new DeckImpl();
    	deckImpl.intializeCard();
    	deckImpl.shuffleCard();
    	deckImpl.displayCard();
    }
    }