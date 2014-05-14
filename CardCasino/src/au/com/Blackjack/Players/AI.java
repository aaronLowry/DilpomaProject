package au.com.Blackjack.Players;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// RESEARCH STRATEGY PATTERN
public class AI extends Player implements Strategy {
	
	List<String> names = new ArrayList<String>();
	Random R = new Random();
	
	public AI(String PlayerName, double Chips) {
		super(PlayerName, Chips);
		createNames();
		PlayerName = names.get(R.nextInt(5)).toString();
		Chips = 1000.00;
	}
	
	private void createNames() {
		this.names.add("Harry");
		this.names.add("Joe");
		this.names.add("Roger");
		this.names.add("Greg");
		this.names.add("Barry");
		this.names.add("Adrian");
	}
}
