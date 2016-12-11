import java.util.Scanner;
import java.util.InputMismatchException;
class InputException extends Exception {}

public class AverageInt {
	//all live in the main, bit gross, eugh
	public static void main(String[] args) throws InputMismatchException {
	Scanner input = new Scanner(System.in);

	//ask for number of ints, take input w/ scanner
	System.out.println("How many numbers would you like to input??");
	int n = input.nextInt();
	//create array based on above input
	int[] integers = new int[n];
	//ask for the number of integers
	System.out.println("Please enter "+n+" integers");
	int tmp = 0; //keeps a running total of the numbers put in 
	
		//try to check if j < 0 and if it's not throw error and catch
		//it with the 'must be positive' error message and reprompt
		for (int i = 0; i < n; i++) {
			int j = 0;
			try {
				j = input.nextInt();
				if (j < 0) {
				throw new InputException();
				}
			} catch(InputMismatchException e) {
				System.out.println("Please enter an actual Integer");
				input.next();
				i--;
				continue;
			} catch (InputException e) {
				System.out.println("Please enter a POSITIVE Integer");
				i--;
				continue;
			}	
			integers[i] = j;
			tmp += j;

		}
	System.out.println("The average of all your integers is: "+(tmp / n));	
	}
}
