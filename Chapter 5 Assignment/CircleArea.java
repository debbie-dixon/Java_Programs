import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.println("The area of the circle is: " + area);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}