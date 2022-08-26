package Exercises;

import java.math.*;
public class Exercise0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doAssignment();
	}
	public static void doAssignment(){
		System.out.println("Hello, World!");
		double randomNumber = (Math.random()*90)+10;
		for(int x =0; x<11;x++) {
			if (x%2==0) {
				System.out.println(x);
			}
		}
		int[] numberArray = new int[10];
		for (int x=0;x<9;x++) {
			int num =(int) (Math.round(Math.random() *100)+10);
			numberArray[x] =num;
			System.out.println(num);
			
		}
		
		for (int x =0;x<9;x++) {
			System.out.println(numberArray[x]);
		}
		
		int[][] multiplicationTable = new int[12][12];
		
		for (int x = 1; x<=12; x++) {
			System.out.println("There's x");
			System.out.println(x);
			multiplicationTable[0][x-1] = x;
			multiplicationTable[x-1][0] = x;
			
		}
		for (int x = 0;x<12;x++) {
			for (int y = 0;y<12;y++) {
			multiplicationTable[x][y] = multiplicationTable[0][x]*multiplicationTable[y][0];
			System.out.println("this is table x y " + multiplicationTable[x][y] );
			System.out.println("mult tablev ");
			System.out.println(multiplicationTable[0][x]);
			}
			
			
			
		}
		for (int x = 0; x<=11; x++) {
			for (int y =0; y<=11; y++) {
				System.out.print(multiplicationTable[x][y]+ " ");
				if (y==11) {
					System.out.println();
				}
			}
		}
		System.out.print("The sum of 7 and 8 is " + 7 + 8); 
		double len = 5;
		len *=2;
		len+=len;
		System.out.println(len/=100);
			
	}

}
