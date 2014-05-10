package au.com.Blackjack.GameRules;

//Rules Class
public abstract class Blackjack extends Rules {

	// Properties of the player
	double betPlaced; // The bet that the player has made prior to dealing of the cards.
	double playerWinnings;
	Object[] playerHand = new Object[0];
	
	// Properties of the Blackjack class
	public final static int HIGHEST_SCORE = 21;
	private int blackjackOdds;
	public int highestBet = blackjackOdds * 100;
			
	// Check up on these rules about the dealer sitting or hitting on 17, ie.
	// Soft sitting and  hard hitting
	public final static int DEALER_SOFT_HARD_17 = 17;
	//public final static boolean IS_SOFT_17 = false;
	//public final static boolean IS_HARD_17 = false;
	
	// Get/Set winning odds
	public int getBlackjackOdds(int deckSize) {
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
	
	// Players hand
	public void addCardToHand(Object card, int CardCount) {
		playerHand[CardCount] = card;
	}
	public void emptyHand(boolean endRound) {
		if(endRound) {
			for(int i = 0; i < playerHand.length; i++) {
				playerHand[i] = null;
			}
		}
	}
	public void playerCards(int cardCount) {
		if(cardCount > HIGHEST_SCORE) {
			playerBust();
		} else {
			if(cardCount < HIGHEST_SCORE) {
				// Player must choose which method to take. ie. Stand, Hit, etc.
			}
			else {
				playerBlackjack();
			}
		}
	}
	public void playerBust() {
		playerWinnings = 0;
	}
	public void playerBlackjack() {
		playerWinnings *= blackjackOdds;
	}
}
