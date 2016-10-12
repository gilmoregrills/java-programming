import java.util.Scanner;

public class Positive {
	public static void main (String[] args) {
		
		System.out.println("Enter a double value: ");

		Scanner input = new Scanner(System.in);
		double userNum = input.nextDouble();
		

		if (userNum > 0) {
			System.out.println("Enter another :");
			Scanner input2 = new Scanner(System.in);
			double userNum2 = input.nextDouble();

		} else if (userNum < 0) {
			double posNum = (userNum * -1);
			System.out.println("Your negative double, positive: "+posNum);
		} else if (userNum !== double) {
			System.out.println("You didn't enter a double!");
		}
	}
}
