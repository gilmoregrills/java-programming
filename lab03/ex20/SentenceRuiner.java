import java.util.Scanner;

public class SentenceRuiner {

	public static void main (String[] args) {
		ruiner();
	}

	public static void ruiner () {
		System.out.println("Please enter a string.");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		char[] inputArray = sentence.toCharArray(); //can I condense this line and the above? 
		//char[] inputArray = (input.nextLine()).toCharArray();

		//System.out.println((char[])inputArray);

		//reverse the array
		//took some hella twisty thinking but I think this is the right way to do it. 
		//I miss JavaScript's .reverse() method
		
		for (int j = 0; j < inputArray.length / 2; j++) {
			char tmp = inputArray[j];
			inputArray[j] = inputArray[inputArray.length - j - 1];
			inputArray[inputArray.length - j - 1] = tmp;	
		}

		//System.out.println((char[])inputArray);	
		//loop through each char, and remove it if it's a space or punctuation. If it's a letter, change its case!
		//current solution is kind of hacky, an empty/null char still takes up memory space.
		//for a while toUpperCase wasn't working, because I was just calling toUpperCase(x). toUpperCase actually RETURNS the 
		//upper case value, it doesn't change the value itself. 

		for (int i = 0; i <= (inputArray.length - 1); i++) {
			if (!Character.isLetter(inputArray[i])) {
				char blank = '\u0000';	
				inputArray[i] = blank;
			} else if (Character.isUpperCase(inputArray[i])) {
				inputArray[i] = Character.toLowerCase(inputArray[i]);
			} else {
				inputArray[i] = Character.toUpperCase(inputArray[i]);
			}		
		}		
				
		System.out.println((char[])inputArray);	
	}

}
