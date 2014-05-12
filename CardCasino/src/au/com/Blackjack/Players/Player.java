package au.com.Blackjack.Players;

import java.util.List;

public class Player {
	
	// Constants
	private static final int MIN_CARDS_IN_HAND = 2;
	private static final int MAX_CARDS_IN_HAND = 5;
	
	// Fields
	private String playerName;
	private double chips;
	private Object[] playerHand;

	// Constructors
	public Player(String PlayerName, boolean Dealer) {
		setPlayerName(PlayerName);
	}
	public Player(String PlayerName, double Chips) {
		setPlayerName(PlayerName);
		setChips(Chips);
	}
	
	// Getters and Setters
	private void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerName() {
		return this.playerName;
	}	
	
	private void setChips(double chips) {
		this.chips = chips;
	}
	public double getChips() {
		return chips;
	}

	// Players Hand
	// Need to refactor this method as it won't work if there is a need for more cards
	public void playerHand(Object[] cards) {
		if(playerHand.length < MIN_CARDS_IN_HAND) {
			for(int i = 0; i < cards.length; i++) {
				playerHand[i] = cards[i];
			}
		}
	}
	public void emptyPlayerHand() {
		for(int i = 0; i < playerHand.length; i++) {
			playerHand[i] = null;
		}
	}
}
