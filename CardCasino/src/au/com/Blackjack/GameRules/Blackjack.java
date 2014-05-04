package au.com.Blackjack.GameRules;

import java.lang.reflect.Method;

import au.com.Blackjack.Deck.Deck;

//Rules Class
public abstract class Blackjack extends Rules {

	// Properties of the player
	static int betPlaced; // The bet that the player has made prior to dealing of the cards.
	int playerWinnings;	
	
	// Properties of the Blackjack class
	public final static int HIGHEST_SCORE = 21;
	private int blackjackOdds;
	public int highestBet = blackjackOdds * 100;
			
	// Check up on these rules about the dealer sitting or hitting on 17, ie.
	// Soft sitting and  hard hitting
	public final static int DEALER_SOFT_HARD_17 = 17;
	public final static boolean IS_SOFT_17 = false;
	public final static boolean IS_HARD_17 = false;
	
	
	
	public void playerCards(int cardCount) {
		if(cardCount > HIGHEST_SCORE) {
			// Call playerBust method
		} else {
			if(cardCount < HIGHEST_SCORE) {
				// Player must choose which method to take. ie. Stand, Hit, etc.
			}
			else {
				playerBlackjack();
			}
		}
	}
	
	
	
	private void playerBlackjack() {
		playerWinnings = BLACKJACK_ODDS;
	}
	
	private static int getBlackjackOdds(/*Place decksize here*/) {
		if(deckSize < 3) {
			return 1;
		}else {
			if(deckSize < 5) {
				return 2;
			}
			else {
				return 3;			
			}
		}
	}
	
	
	
}
