import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        double minimum = minimum3(num1, num2, num3);

        System.out.println("The smallest value is: " + minimum);
    }

    public static double minimum3(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}