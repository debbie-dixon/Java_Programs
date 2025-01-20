import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        int result = integerPower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}