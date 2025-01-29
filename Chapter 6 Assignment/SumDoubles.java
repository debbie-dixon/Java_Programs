public class SumDoubles {
    public static void main(String[] args) {
        double sum = 0.0;

        
        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg); // Convert string to double
                sum += value; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid number.");
            }
        }

        
        System.out.println("Sum of double values: " + sum);
    }
}
