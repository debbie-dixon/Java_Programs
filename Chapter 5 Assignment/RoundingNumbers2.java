import java.util.Scanner;

public class RoundingNumbers2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter double values or 0 to stop:");

        while (true) {
            System.out.print("Enter a double value: ");
            double number = input.nextDouble();

            if (number == 0) {
                break; // Exit the loop if the input is 0
            }

            System.out.println("Original number: " + number);
            System.out.println("Rounded to integer: " + roundToInteger(number));
            System.out.println("Rounded to tenths: " + roundToTenths(number));
            System.out.println("Rounded to hundredths: " + roundToHundredths(number));
            System.out.println("Rounded to thousandths: " + roundToThousandths(number));
            System.out.println();
        }

        System.out.println("Program has ended");
    }

    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}