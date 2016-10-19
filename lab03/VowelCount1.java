import java.util.Scanner;

public class VowelCount1 {
	
	public static void main (String[] args) {
	check();	

	}

	public static void check () {
		System.out.println("Please enter a string: ");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		int counter = 0;
		
		for (int i = 0; i <= (sentence.length() - 1); i++) {
			char letter = sentence.charAt(i);

			switch (letter) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					counter++;
					break;
				default:
					break;
			}
		}
		System.out.println("That string contains "+counter+" vowels.");
	}
}

