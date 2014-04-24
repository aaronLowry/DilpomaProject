package au.com.CardCasino.Players;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String playerName;
	private double chips;
	private List<Object> playerHand = new ArrayList<Object>();

	public Player(String PlayerName) {
		setPlayerName(PlayerName);
	}
	public Player(String PlayerName, double Chips) {
		setPlayerName(PlayerName);
		setChips(Chips);
	}
	
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

	public void playerHand(Object card) {
		playerHand.add(card);
	}

}
