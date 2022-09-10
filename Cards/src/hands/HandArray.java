package hands;

import Cards.Deck;
import Cards.PlayingCard;

//HandArray is a class implementing a hand of cards using an array

public class HandArray extends Deck implements HandOfCards{

	private PlayingCard hand[];
	private int count;
	
	public HandArray () {
		this(2);
	}
	
	public HandArray(int length) {
		count = 0;
		hand = new PlayingCard[length];
		for (int ii=0;ii<length;ii++)
			hand[ii] = null;
	}
	
	public void add(PlayingCard c) {
		for (int x=0; x<hand.length; x++) {
			hand[x] = c;
			count+=1;
		}
	}
	
	public String toString() {
		String string = new String("This cards in this hand are: ");
		for (int x = 0; x< count; x++) {
			string += " " + hand[x];
			if(x <= count-2) {
				string += " and a ";
			}
		}
		return string;
	}
}
