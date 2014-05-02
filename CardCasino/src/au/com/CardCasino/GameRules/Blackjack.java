package au.com.CardCasino.GameRules;

import au.com.CardCasino.Deck.Deck;

//Rules Class
public abstract class Blackjack extends Rules {

	// Properties of the Blackjack class
	public final static int HIGHEST_SCORE = 21;
	public final static int BLACKJACK_ODDS = //#ofDecks * betPlaced. To be changed depending on the number of decks used. MAYBE USE A METHOD TO DETERMINE
											// DECK SIZE vs RATIO. less than 3 decks there is no odds less than 5 2:1, etc.
			
	// Check up on these rules about the dealer sitting or hitting on 17, ie.
	// Soft sitting and  hard hitting
	public final static int DEALER_SOFT_SIT = 17;
	public final static int DEALER_HARD_HIT = 17;
	
	// Properties that the player has
	int betPlaced; // The bet that the player has made prior to dealing of the cards.
	int playerWinnings;
	
	
	public void playerCards(int cardCount) {
		if(cardCount > HIGHEST_SCORE) {
			// Call playerBust method
		} else {
			if(cardCount < HIGHEST_SCORE) {
				// Player must choose which method to take. ie. Stand, Hit, etc.
			}
			else {
				// The player has blackjack and wins 3:1 odds
			}
		}
	}
	
	private void playerBlackjack() {
		//player has won, player receives house odds.
	}
	
	
	
}
