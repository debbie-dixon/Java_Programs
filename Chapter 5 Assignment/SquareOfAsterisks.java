import java.util.Scanner;

public class SquareOfAsterisks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        int side = input.nextInt();

        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}