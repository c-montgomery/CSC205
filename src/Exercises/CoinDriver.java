package Exercises;

public class CoinDriver {
	private double sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonetaryCoin random1 = new MonetaryCoin();
		MonetaryCoin random2 = new MonetaryCoin();
		MonetaryCoin random3 = new MonetaryCoin();
		
		System.out.println("Assigned value: ");
		random1.assignValue();
		System.out.println("Assigned value: ");
		random2.assignValue();
		
		random3.setValue(25);
		System.out.println("Assigned value: ");
		System.out.println(random3.getValue());
		
		System.out.println(random1.toString());
		random1.flip();
		System.out.println(random1.toString());
		
		System.out.println("Sum: " + "\n" + (random1.getValue() + random2.getValue()+random3.getValue()));
		
	}

}
