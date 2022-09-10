package hands;

import Cards.Deck;
import Cards.PlayingCard;

public class Hand extends Deck {
	PlayingCard card1;
	PlayingCard card2;
	
	
	
	public Hand(){
		PlayingCard card1;
		PlayingCard card2;
		add(dealCard());
		add(dealCard());
	}
	
	
	void add(PlayingCard c) {
		if(card1 == null) {
			card1 = c;
			
		}else if(card2 ==null) {
			card2 = c;
		}
	}
	
	public String toString() {
		return "Hand: \n" + card1 + "\n" + card2;
		
	}
	
	
	


}
