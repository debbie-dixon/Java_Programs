import java.util.Random;
import java.util.Scanner;
public class RandomNumbers{
	public static void main(String[] args) {
		Random random = new Random();
		
		// create a variable to store the random number generated
		int randomNum = random.nextInt();
		
		System.out.printf("Random number is %d%n", randomNum);
		
		// generating a number within a specified range
		int randomNumInRange = random.nextInt(20);
		
		System.out.printf("Random number in range is %d%n", randomNumInRange);
		
		// generating a float point number
		
		double floatPointNum = random.nextDouble();
		
		System.out.printf("Random float point number  is %.2f%n", floatPointNum);
		
		// generating a float point number within a range
		
		double min = 10.0;
		double max = 20.0;
		
		double randomFloatPointInRange = min + (max - min)* random.nextDouble();
		
		System.out.printf("Random Double Number In Range is : %.2f%n", randomFloatPointInRange);
		
		// Generate a random boolean value
		boolean booleanValue = random.nextBoolean();
		
		System.out.printf("Random boolean value is : %b%n", booleanValue);
		
		// generate a random number within a limit a user will input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter upperlimit to be generated: ");
		int upperLimit = scan.nextInt();
		
		if (upperLimit == 0) {
			System.out.println("The number must be greater than 0");
		}
		else {
			int randomNumber = random.nextInt(upperLimit) + 1;
			System.out.printf("Generated number from 0 - %d is:%d%n", upperLimit, randomNumber);
		}	
		
		
	}
}
