import java.util.Scanner;  //class imported
public class Circle {  //class created
    public static void main(String[] args) { //main method created
        // Create a scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle (as an integer): ");
        int radius = scanner.nextInt();

        // Define the constant value for π
        final double PI = 3.14159;

        // Print the diameter, circumference, and area
        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %.2f%n", 2 * PI * radius);
        System.out.printf("Area: %.2f%n", PI * radius * radius);

        // Close the scanner
        scanner.close();
    }
}
