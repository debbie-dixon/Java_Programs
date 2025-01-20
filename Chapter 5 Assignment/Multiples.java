import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pairs of integers (enter 0 to exit):");

        while (true) {
            System.out.print("Enter the first integer: ");
            int first = input.nextInt();

            System.out.print("Enter the second integer: ");
            int second = input.nextInt();

            if (first == 0 && second == 0) {
                break; // Exit the loop if both integers are 0
            }

            if (isMultiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            } else {
                System.out.println(second + " is not a multiple of " + first);
            }
        }

        System.out.println("Program has ended");
    }

    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }
}