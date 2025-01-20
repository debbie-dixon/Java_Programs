import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers or 0 to end:");

        while (true) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (number == 0) {
                break; // Exit the loop if the input is 0
            }

            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        System.out.println("Program ended");
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}