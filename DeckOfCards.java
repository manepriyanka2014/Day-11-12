package com.bridgelabz.objectOrientedPrograms;
import com.bridgelabz.utility.BankDetails;
import com.bridgelabz.utility.DeckOfCards;

import java.util.HashSet;
import java.util.Set;
public class DeckOfCards {

	    static int numOfPlayers = 4;
	    static int cardsToEachPlayer = 9;

	    static String[] suits = {"Diamond", "Heart", "Spades", "Club"};
	    static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack" , "Queen", "King", "Ace"};
	    ///Main method
	    public static void main(String[] args) {

	        //Creating object for DeckOfCards class
	        DeckOfCards deckOfCards = new DeckOfCards();

	        String[][] totalCards = deckOfCards.generateCards(suits, rank);
	        Set<String> cards = new HashSet<String>();

	        //Creating 'player'  to stores the cards of all(4) player
	        String[][] player = new String[numOfPlayers][cardsToEachPlayer];
	        int i = 0, j = 0, k = 0, l = 0, m = 0;

	        int totalCardsDistribute  = numOfPlayers * cardsToEachPlayer;
	        while (i < totalCardsDistribute) {
	            int randomSuit = (int) Math.floor(Math.random()*10)%4;
	            int randomRank = (int) Math.floor(Math.random()*100)%13;

	            if (cards.add(totalCards[randomSuit][randomRank])) {
	                if (i%4 == 0) {
	                    player[i%4][j] = totalCards[randomSuit][randomRank];
	                    j++;
	                    i++;
	                } else if(i%4 == 1 ) {
	                    player[i%4][k] = totalCards[randomSuit][randomRank];
	                    k++;
	                    i++;
	                } else if(i%4 == 2 ) {
	                    player[i%4][l] = totalCards[randomSuit][randomRank];
	                    l++;
	                    i++;
	                } else if(i%4 == 3 ) {
	                    player[i%4][m] = totalCards[randomSuit][randomRank];
	                    m++;
	                    i++;
	                }
	            }
	        }
	        //calling  printPlayerCard method
	        deckOfCards.printPlayerCard(player);
	    }
	}

	  



