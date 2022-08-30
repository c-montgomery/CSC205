package Exercises;

public class Sphere {
	public static void main(String args[]) {
		
		
		
	}
	
	private double diameter;
	private double volume;
	private double surfaceArea;
	public Sphere() {
		
		this.diameter = 1;
	}
	
	public  Sphere(double diameter) {
		
		this.diameter = diameter;
		this.volume = (((double)4/3 * Math.PI)* Math.pow(this.diameter/2, 3));
		this.surfaceArea = 4* Math.PI * Math.pow(this.diameter/2, 2); 
	}
	
	public void setDiameter(double diam) {
		
		this.diameter = diam;
		this.volume = (((double)4/3 * Math.PI)* Math.pow(diam/2, 3));
		this.surfaceArea = 4 * Math.PI * Math.pow(diam/2, 2); 
	}
	
	public double getDiameter() {
		
		return this.diameter;
	}
	
	public double getVolume() {
	
		return this.volume;
	}
	
	public double getSurfaceArea() {
		
		return this.surfaceArea;
	}
	
	public String toString() {
		
		String attributes = "A sphere with a diameter of " + String.format("%.2f", this.getDiameter()) +" has a"
				+ " volume of " + String.format("%.2f" , this.getVolume())+ " and a surface area of"
						+ " " + String.format("%.2f", this.getSurfaceArea());
		return attributes;		
	}
}