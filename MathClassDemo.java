public class MathClassDemo{
	public static void main(String[] args){
		
		System.out.println(MathClassDemo.areaOfCircle());
		
		MathClassDemo.power(10,2);
		
		MathClassDemo.maximum(5,25);
		
		MathClassDemo.minimum(5,25);
		
		MathClassDemo.absolute();
		
		MathClassDemo.squareRoot();
		
		MathClassDemo.randomNum();
		
	}
	
    public static double areaOfCircle() {
        double radius = 5;
        double area = Math.PI * radius * radius; // Calculate area of a circle
        return area;
    }
	
    public static void power(int base, int exponent) {
        int result = (int)Math.pow(base, exponent); // 2^3 = 8
        System.out.printf("%d raised to the power of %d is: %d%n", base, exponent, result);
    }
	
    public static void maximum(int num1, int num2) {
        int max = Math.max(num1, num2);
        System.out.println("The maximum number is: " + max);
    }
	
	 public static void minimum(int num1, int num2) {
        int min = Math.min(num1, num2);
        System.out.println("The minimum number is: " + min);
    }
	
    public static void absolute() {
        int negativeNum = -22;
        int absoluteValue = Math.abs(negativeNum);
        System.out.println("The absolute value is: " + absoluteValue);
    }
	
    public static void squareRoot() {
        int number = 49;
        int squareRoot = (int)Math.sqrt(number); // Square root of 16 = 4
        System.out.printf("Square root of %d is: %d%n", number, squareRoot);
    }
	
    public static void randomNum() {
        // Example: Random integer between 1 and 10
        int randomInt = (int) (Math.random() * 16) + 2;
        System.out.println("Random integer between 2 and 16: " + randomInt);
    }
}







	




