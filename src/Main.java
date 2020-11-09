import java.util.*;
public class Main {
	private static double guess = 0;
	private static int roll = 0;
	private static Scanner input = new Scanner(System.in);
	private static Random randomRoll = new Random();
	private static int MINIMUM_ROLL = 1;
	private static int MAXIMUM_ROLL = 6;
	public static void main(String[] args) {
		Main o = new Main();
		guess = playerGuess();
		roll = computerRoll(MINIMUM_ROLL, MAXIMUM_ROLL);
		if(guess == roll) {
			System.out.println("You guessed correctly! The number was " + roll);
		}else {
			System.out.println("Incorrect Guess: You lose! The number was " + roll);
		}
		System.out.println("Play Again? Press Y for Yes or N for No");
		String choice = input.next();
		if(choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes")) {
			o.main(null);
		}else {
			System.exit(0);
		}
	}
	public static int playerGuess() {
		System.out.print("Enter a number between 1 and 6: ");
		double d = input.nextDouble();
		guess = (int)d;
		if(guess >= 1 && guess <=6) {
			return (int) guess;
		}
		else {
			System.out.println("Invalid number");
			playerGuess();
		}
		return 0;
	}
	public static int computerRoll(int min, int max) {
		roll = randomRoll.nextInt((max - min) + 1) + min;
		return roll;
	}
}