import java.util.Scanner; //class imported

public class LargestAndSmallest { //public class created
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter five integers:");

        // Read five integers
        System.out.print("Enter integer 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter integer 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter integer 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter integer 4: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter integer 5: ");
        int num5 = scanner.nextInt();

        // Initialize largest and smallest
        int largest = num1;
        int smallest = num1;

        // Compare each number to find the largest and smallest
        if (num2 > largest) largest = num2;
        if (num2 < smallest) smallest = num2;

        if (num3 > largest) largest = num3;
        if (num3 < smallest) smallest = num3;

        if (num4 > largest) largest = num4;
        if (num4 < smallest) smallest = num4;

        if (num5 > largest) largest = num5;
        if (num5 < smallest) smallest = num5;

        // Display the results
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The smallest number is: %d%n", smallest);

        // Close the scanner
        scanner.close();
    }
}
