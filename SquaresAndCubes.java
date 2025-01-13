public class SquaresAndCubes { //public class created
    public static void main(String[] args) { //main method
        // Print table header
        System.out.printf("%-10s %-10s %-10s%n", "Number", "Square", "Cube");
        System.out.println("-----------------------------------");

        // Calculate and print squares and cubes for numbers 0 to 10
        for (int number = 0; number <= 10; number++) {
            System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
        }
    }
}
