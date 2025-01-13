// import scanner
import java.util.Scanner;
// class created
	public class Comparison { 
		public static void main(String[] args) {  //main method created
		Scanner input = new Scanner(System.in);
//declaration of variables
	int x;
	int y;
// prompting the user and taking in the integers
System.out.print("Enter first integer: ");
y = input.nextInt();
System.out.print("Enter second integer: ");
x = input.nextInt();
	if  (x==y)
		System.out.println("These numbers are equal");
	else if (x>y)
		System.out.printf("%d is the larger number", x);
	else
		System.out.printf("%d is the larger number", y);
		}
	}
