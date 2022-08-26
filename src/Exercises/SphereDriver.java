package Exercises;



public class SphereDriver {
	public static void main(String args[]) {
		Sphere circle1 = new Sphere(4);
		System.out.println(circle1.toString());
		System.out.println(circle1.getDiameter());
		System.out.println(circle1.getSurfaceArea());
		System.out.println(circle1.getVolume());
		circle1.setDiameter(5);
		System.out.println(circle1.toString());
		
	}
}
