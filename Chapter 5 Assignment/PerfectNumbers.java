public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
                System.out.print("Factors: ");
                printFactors(number);
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sumOfFactors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }

        return sumOfFactors == number;
    }

    public static void printFactors(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}