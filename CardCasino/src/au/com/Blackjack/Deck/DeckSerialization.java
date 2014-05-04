package au.com.Blackjack.Deck;

import java.io.*;

public abstract class DeckSerialization {
	
	public static void writeDeck(Deck deck) {		
		ObjectOutputStream output = null;
		
		try{
			output = new ObjectOutputStream(new FileOutputStream("deck.ser"));			
		}catch(IOException ioException) {
			System.err.println("Error opening file");
		}
		
		try{
			output.writeObject(deck);
		}catch(IOException ioException) {
			System.err.println("Error writing file");
		}
		
		try {
			if(output != null) {
				output.close();
			}
		}catch (IOException ioException) {
			System.err.println("Error closing file, program will now exit");
			System.exit(1);
		}
	}
	
	public static Deck readDeck() {
		ObjectInputStream input = null;
		Deck deck = null;
		
		try {
			input = new ObjectInputStream(new FileInputStream("deck.ser"));
		}catch(IOException ioException) {
			System.err.println("Error opening file");
		}
		
		try {
			deck = (Deck)input.readObject();
		}catch(ClassNotFoundException cNFException) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Error opening file");
		}
		
		return deck;
	}
}
