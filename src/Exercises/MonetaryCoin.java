package Exercises;

public class MonetaryCoin extends Coin{

	private int value = 0;
	private int[] denominations = {1,5,10,25};
	
	public void assignValue() {
		this.value = denominations[(int)Math.round(Math.random()*3)];
		System.out.println(this.getValue());
	}
	public void setValue(int val) {
		this.value = val;
	}
	
	public double getValue() {
		
		return this.value;
	}
	

}
