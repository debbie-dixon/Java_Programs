import java.util.Scanner;

public class SeparatingDigits2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        displayDigits(number);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        int digit;

        while (number > 0) {
            digit = remainder(number, 10);
            System.out.print(digit + "  ");
            number = quotient(number, 10);
        }
    }
}