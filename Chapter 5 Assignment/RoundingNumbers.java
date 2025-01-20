import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter double values or 0 to stop:");

        while (true) {
            System.out.print("Enter a double value: ");
            double number = input.nextDouble();

            if (number == 0) {
                break; // Exit the loop if the input is 0
            }

            int roundedNumber = (int) Math.floor(number + 0.5);

            System.out.println("Original number: " + number);
            System.out.println("Rounded number: " + roundedNumber);
            System.out.println();
        }

        System.out.println("End of program");
    }
}