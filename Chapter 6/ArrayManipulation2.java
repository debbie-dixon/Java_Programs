import java.util.Scanner;
public class ArrayManipulation2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] numbers = new int[10];
		
		int sum1 = 0;
		int sum2 = 0;
		
		
		
		for(int i = 0; i < 10; i++) {
		System.out.println("Enter numbers: ");
		numbers[i] = scan.nextInt();
		
		if (i > 0 || i < 6) {
			sum1 += numbers[i]; 
		}			
			
		else if (i > 5 && i <9) {
			sum2 += numbers[i];
		}
		else
			continue;
		
		}
		int subtract = sum1-sum2;
		
		System.out.printf("The result is %d", subtract);
		
	}
}
		
		