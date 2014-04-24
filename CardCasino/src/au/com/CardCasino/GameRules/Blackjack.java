package au.com.CardCasino.GameRules;

//Rules Class
public abstract class Blackjack extends Rules {

	public final static int HIGHEST_SCORE = 21;
	// Check up on these rules about the dealer sitting or hitting on 17, ie.
	// Soft sitting and  hard hitting
	//public final static int DEALER_SOFT_SIT = 17;
	//public final static int DEALER_HARD_HIT = 17;
	
	public void playerScore(int Score) {
		if(Score > HIGHEST_SCORE) {
			// Player bust
		} else {
			if(Score < HIGHEST_SCORE) {
				PlayerTurn(true);
			}
			else {
				playerBlackjack();
			}
		}
	}
	
	private void playerBlackjack() {
		//player has won, player receives house odds.
	}
	
	
	
}
