import java.util.Scanner; // class imported

public class DigitSeparator {  // class created
    public static void main(String[] args) {   //main method
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the number has exactly five digits
        if (number >= 10000 && number <= 99999) {
            // Extract and print each digit
            int digit1 = number / 10000;           
            int digit2 = (number / 1000) % 10;     
            int digit3 = (number / 100) % 10;      
            int digit4 = (number / 10) % 10;       
            int digit5 = number % 10;             

            // Print digits separated by three spaces
            System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
        } else {
            System.out.println("Error: You must enter exactly a five-digit number.");
        }

        // Close the scanner
        scanner.close();
    }
}
