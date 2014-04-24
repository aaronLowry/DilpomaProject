package au.com.CardCasino.GameRules;

public class Rules {

	public boolean playerSit(boolean sit) {
		if(sit){
			return true;
		} else{
			return false;
		}
	}
	
	public boolean playerBust(boolean bust) {
		if(bust) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBlackjack(int cardCount) {
		if(cardCount == 21) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean playerSplit(boolean split) {
		if(split) {
			return true;
		} else {
			return false;
		}		
	}	
}
