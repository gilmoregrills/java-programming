import java.util.Scanner;
import java.util.InputMismatchException;
class InputException extends Exception {}

public class AverageInt {
	public static void main(String[] args) throws InputMismatchException {
	Scanner input = new Scanner(System.in);


	System.out.println("How many numbers would you like to test?");
	int n = input.nextInt();
	int[] integers = new int[n];
	System.out.println("Please enter "+n+" integers");
	int tmp = 0;
		//try to check if j < 0 and if it's not throw error and catch
		//it with the 'must be positive' error message and reprompt
	for (int i = 0; i < n; i++) {
		int j = 0;
		try {
			j = input.nextInt();
			if (j < 0) {
				throw new InputException();
			}
		}
		catch(InputMismatchException|InputException e) {
			System.out.println("Please enter a positive Integer");
			input.next();
			i--;
			continue;
		}
		integers[i] = j;
		tmp += j;
		//current problem: if an exception occurs, overwrites
		//one index on the array
	}
	
	System.out.println("The average of all your integers is: "+(tmp / n));	
	}
}
