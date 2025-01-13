import java.util.Scanner;

public class Constant{
	static final double pi = 3.142; // final is for constant values only
	
	static int age = 50;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = scan.nextDouble();
		
		Constant.area(radius);
		
	}
	public static void area(double radius) {
		double areaOfCircle = pi * radius * radius;
		System.out.printf("The area of the circle is %.2f%n", areaOfCircle);
		
		Constant.check();
	}
	public static void check(){
		if (age >= 18)
			System.out.println("Yes, you are an adult");
		
	}
}