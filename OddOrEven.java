import java.util.Scanner; //class impored

public class OddOrEven { //public class created
    public static void main(String[] args) { //main method
        // Create a scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
