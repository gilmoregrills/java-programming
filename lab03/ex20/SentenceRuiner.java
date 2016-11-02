import java.util.Scanner;

public class SentenceRuiner {

	public static void main (String[] args) {
		ruiner();
	}

	public static void ruiner () {
		System.out.println("Please enter a string.");
		Scanner input = new Scanner(System.in);
		//declares new char array containing scanner input 
		char[] inputArray = (input.nextLine()).toCharArray();

		//reverse the array		
		for (int j = 0; j < inputArray.length / 2; j++) {
			char tmp = inputArray[j];
			inputArray[j] = inputArray[inputArray.length - j - 1];
			inputArray[inputArray.length - j - 1] = tmp;	
		}

		//loop through each char, and remove it if it's a space or punctuation. If it's a letter, change its case!
		//current solution is kind of hacky, an empty/null char still takes up memory space. 
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
