import java.util.Scanner;

public class Positive {
	public static void main (String[] args) {
		double userNum = 0;
		double userNum2 = 0;
		double difference = 0;
		System.out.println("Enter a double value: ");	
		userNum = getDouble();

		isPositive(userNum);

		
		System.out.println("Enter another :");
		userNum2 = getDouble();
		
		isPositive(userNum2);
		if (userNum < userNum2) {
			difference = userNum2 - userNum;
		} else {
			difference = userNum - userNum2;
		}
		System.out.println("The difference between those two numbers is: "+difference);
	}
	public static double getDouble () {

		Scanner input = new Scanner(System.in);
		boolean isDouble = false;
		double theReturn = 0;
		
		while (!isDouble) {
			if (input.hasNextDouble()) {
				theReturn = input.nextDouble();
				isDouble = true;
			} else {
				System.out.println("You didn't enter a double: "+input.next());
			}
		}
		return theReturn;

	}
	public static double isPositive(double a) {

		if (a < 0) {
			double posNum = (a * -1);
			System.out.println("Your negative double, positive: "+posNum);
			a = posNum;
		} 
		return a;
	}
}
