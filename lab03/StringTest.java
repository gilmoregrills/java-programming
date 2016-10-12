import java.util.Scanner;

public class StringTest {
	public static void main (String[] args) {

		System.out.println("Enter a string: ");
		
		Scanner input = new Scanner(System.in);
		String words = input.nextLine();
		//int wordsLength = String.length(words);
		//String wordsUp = words.toUpperCase();
		//String wordsLo = words.toLowerCase();

		System.out.println("Your string is: "+ words);
		
		System.out.println("Your string is "+words.length()+" digits long");

		System.out.println("Your string in all  UPPERCASE is: "+words.toUpperCase());

		System.out.println("Your string in all lowercase is: "+words.toLowerCase());

		System.out.println("The first letter is: "+words.substring(0, 1)+" and the last is: "+words.substring((words.length()-1), words.length()));

		System.out.println("Finally, here it is without whitespaces: "+words.replace(" ", ""));
	}
}	
