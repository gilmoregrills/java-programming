import java.util.Scanner;

public class SentenceRuiner {

	public static void main (String[] args) {
		ruiner();
	}

	public static void ruiner () {
		System.out.println("Please enter a string.");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		char[] inputArray = sentence.toCharArray(); //can I condense this line and the above

		System.out.println((char[])inputArray);

		//reverse the array

		System.out.println((char[])inputArray);	
	
		for (int i = 0; i <= (inputArray.length - 1); i++) {
			if (!Character.isLetter(inputArray[i])) {
				char blank = '\u0000';	
				inputArray[i] = blank;
			} else if (Character.isUpperCase(inputArray[i])) {
				Character.toLowerCase(inputArray[i]);
			} else {
				Character.toUpperCase(inputArray[i]);
			}		
		}		
		//loop through each char, and remove it if it's a space or punctuation. If it's a letter, change its case!
		//current solution is kind of hacky, an empty/null char still takes up memory space.
		
		System.out.println((char[])inputArray);	
	}

}
