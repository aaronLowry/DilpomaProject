package au.com.CardCasino.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private int size;
	private List<Card> deck;

	// Getters and Setters for the above variables
	public int getSize() {
		return size;
	}

	private void setSize(int Size) {
		this.size = 52 * Size;
	}

	public List<Card> getDeckAsList() {
		return deck;
	}

	// Deck constructor
	public Deck(int Size) {
		setSize(Size);
		deck = new ArrayList<Card>();
		for (int i = 0; i < Size; i++) {
			for (CardSuit suit : CardSuit.values()) {
				for (CardName name : CardName.values()) {
					deck.add(new Card(suit, name));
				}
			}
		}
		Collections.shuffle(deck);
	}

	public class Card {
		private CardSuit suit;
		private CardName name;
		private CardColor color;

		// Card constructor
		public Card(CardSuit suit, CardName name) {
			setName(name);
			setSuit(suit);
			if (suit.equals(CardSuit.Diamonds) || suit.equals(CardSuit.Hearts)) {
				setColor(CardColor.Red);
			} else {
				setColor(CardColor.Black);
			}
		}

		// Getters and Setters for the Card class
		public CardSuit getSuit() {
			return suit;
		}

		private void setSuit(CardSuit cardSuit) {
			this.suit = cardSuit;
		}

		public CardName getName() {
			return name;
		}

		private void setName(CardName cardName) {
			this.name = cardName;
		}

		public CardColor getColor() {
			return color;
		}

		private void setColor(CardColor cardColor) {
			this.color = cardColor;
		}
	}

	// Enumerations for the cards
	private enum CardName {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	}

	private enum CardColor {
		Red, Black
	}

	private enum CardSuit {
		Diamonds, Hearts, Spades, Clubs
	}
}
