package Cards;

public class PlayingCard {
	
	private String suit;
	private int rank;
	
	public PlayingCard() {
		
		
	}
	
	public PlayingCard(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String toString() {
		String attributes =  this.rank + " of "+ this.suit;
		return attributes;
	}
}
