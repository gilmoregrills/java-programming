import java.util.Scanner;

public class VowelCount {
	
	public static void main (String[] args) {
	check();	

	}

	public static void check () {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		System.out.println("Please enter a string: ");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		int counter = 0;
		System.out.println("position 0 on the array is: "+vowels[0]+", sentence is: "+sentence+", and counter is: "+counter);
		
		for (int i = 0; i <= (vowels.length - 1); i++) {
			System.out.println("The current vowel is: "+vowels[i]);

			for (int j = 0; j <= (sentence.length() - 1); j++) {
				System.out.println("Checking if "+sentence.charAt(j)+" is "+vowels[i]);
				if (vowels[i] == sentence.charAt(j)) {
					counter++;
					System.out.println("Yup! We found: "+vowels[i]);
				}
				
			}
			System.out.println("Count is now: "+counter);
		}
		System.out.println("That string contains "+counter+" vowels.");
	}
}

