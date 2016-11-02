import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	//main method runs the game method, passing as argument a call to the random number generator
	public static void main (String[] args) {
		game(generator());
	}	

	public static int generator () {
	//method generates an int between 1 and 100, returns an int
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);
		return randomInt;
	}

		public static void game (int a) {
		//requests guess from the user, compares it to the return from generator, and prints an
		//appropriate message, loops until randomIt == userGuess
		int guessCounter = 0;
		int userGuess = 0;
		do {
			System.out.println("Guess the number between 1 and 100:");
			Scanner input = new Scanner(System.in);
			userGuess = input.nextInt();
			guessCounter += 1;
			
			if (userGuess == a) {
				System.out.println("You guessed correctly!\nYou took "+guessCounter+" guesses.");
			} else if (userGuess < a) {
				System.out.println("Too small");
			} else if (userGuess > a) {
				System.out.println("Too big");
			} 
		} while (userGuess != a);
	}	
}	
