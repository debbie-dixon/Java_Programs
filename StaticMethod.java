import java.util.Scanner;

public class StaticMethod {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		StaticMethod.sum();
		StaticMethod.divide(90, 100);
		System.out.println(StaticMethod.product());
		
		System.out.println(" Enter full name: ");
		String name = scan.nextLine();
		System.out.println(StaticMethod.personName(name));
		
	}
	public static void sum() {
		int x = 50;
		int y = 30;
		int total = x + y;
		System.out.printf("Sum of the two number is %d%n", total);
	}
	public static void divide(int x, int y) {
		double total = (double)x/y;
		System.out.printf("The second sum of the two number is %.2f%n", total);
	}
	
	public static int product() {
		int x = 50;
		int y = 30;
		int total;
		return total = x * y;
	}
	public static String personName(String fullName) {
		return fullName;
	}

}