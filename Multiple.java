import java.util.Scanner; // scanner imported

public class Multiple { //class created
    public static void main(String[] args) { //main method
        // Create a scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Check if num1 is a multiple of num2
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        // Close the scanner
        scanner.close();
    }
}
