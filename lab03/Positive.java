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

		} else {
			String negNum = userNum.toString();
			negNum.replace("-", "");
			double posNum = negNum.parseDouble();
			System.out.println("Your negative double, positive: "+posNum);
		}
	}
}
