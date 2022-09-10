package Cards;


public class Deck {


	
	public PlayingCard dealCard() {
		String[] suits = {"Diamonds", "Spades", "Hearts","Clubs"};
		int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		return new PlayingCard(suits[(int) Math.round(Math.random()*3)], ranks[(int) Math.round(Math.random()*12)] );
	}
	
}
