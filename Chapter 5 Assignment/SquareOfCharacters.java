import java.util.Scanner;

public class SquareOfCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        int side = input.nextInt();

        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = input.next().charAt(0);

        squareOfCharacters(side, fillCharacter);
    }

    public static void squareOfCharacters(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}