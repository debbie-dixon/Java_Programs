import java.util.Scanner;

public class TemperatureConversions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit:");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double fahrenheit = input.nextDouble();
            double celsius = celsius(fahrenheit);
            System.out.println("Celsius equivalent: " + celsius);
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double celsius = input.nextDouble();
            double fahrenheit = fahrenheit(celsius);
            System.out.println("Fahrenheit equivalent: " + fahrenheit);
        } else {
            System.out.println("Enter a valid option");
        }
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}