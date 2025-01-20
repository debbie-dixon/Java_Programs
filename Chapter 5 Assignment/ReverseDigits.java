import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int reversedNumber = reverse(number);

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit;
            number /= 10; // Remove the last digit
        }

        return reversed;
    }
}