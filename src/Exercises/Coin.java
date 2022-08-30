package Exercises;
/****************************************
 * Coin.java
 * 
 * Represents a coin that can be flipped 
 ****************************************/

public class Coin {
	
	private final int HEADS = 0; //tails is 1
	private int face; // current side showing
	
	/******************************
	 * sets up coin by flipping it
	 * ****************************/
	public Coin() {
		flip();
	}

	/******************************
	 * set a random face value 
	 * ****************************/
	public void flip() {
		face = (int) (Math.random()*2);
	}
	
	/*************************************
	 * returns true if the current face 
	 * value is heads and false otherwise
	 * ***********************************/
	public boolean isHeads() {
		return (face == HEADS);
	}
	
	/******************************
	 * return current face value 
	 * ****************************/
	public String toString() {
		String result;
		if(face == HEADS)
			result = "Heads";
		else
			result = "Tails";
		return result;
	}
}
