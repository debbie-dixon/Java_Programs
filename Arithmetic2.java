// import scanner
import java.util.Scanner;
// class created
public class Arithmetic2 { 
public static void main(String[] args) {  //main method created
Scanner scan = new Scanner(System.in);
//declaration of variables
	int x;
	int y;
	int z;
// prompting the user and taking in the integers
System.out.print("Enter first integer: ");
x = input.nextInt();
System.out.print("Enter second integer: ");
y = input.nextInt();
System.out.print("Enter third integer: ");
z = input.nextInt();
	//arithmetic operations
int sum = x + y+z;
System.out.println(sum);	
	int product = x * y * z;
	System.out.println(product);
	int average = sum/3;
	System.out.println(average);
	
if  (x>y) && (x>z);
	System.out.printf("%d is the largest number" x);
else if (y>x) && (y>z);
	System.out.printf("%d is the larger number", y);	
else if (z>x) && (z>y);
	System.out.printf("%d is the largest number", z);
if  (x<y) && (x<z);
	System.out.printf("%d is the smallest number", x);
else if (y<x) && (y<z);
	System.out.printf("%d is the smallest number", y);
else 
System.out.printf("%d is the smallest number", z);
	}
}
