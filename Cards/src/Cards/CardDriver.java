package Cards;

import hands.HandOfCards;

public class CardDriver {

	public static void main(String[] args) {
		/*Assignment 1 Classes: create Card and Deck classes*/	
		System.out.println("Assignment 1: create Card and Deck classes");

		HandOfCards card = new HandOfCards();
		Deck d = new Deck();
		
		System.out.println("Default card: \t\t" + card);
		
		card.setRank(7);
		card.setSuit("Diamond");
		System.out.println("Chosen card: \t\t" + card);
		
		System.out.println("Randomly delt card: \t" + d.dealCard());
	}
} 