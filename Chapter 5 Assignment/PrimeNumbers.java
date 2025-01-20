public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");

        int count = 0; // To count the number of tests

        for (int number = 2; number < 10000; number++) {
            count++;
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nNumber of tests: " + count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 is not prime by definition
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }

        return true; // If no divisors found, it's prime
    }
}