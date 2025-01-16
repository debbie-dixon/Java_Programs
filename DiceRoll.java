import java.security.SecureRandom;

public class DiceRoll {
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int diceRoll = randomNumbers.nextInt(6) + 1;
		
		System.out.println("You rolled a " + diceRoll);
		}
}