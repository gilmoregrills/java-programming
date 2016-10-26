public class isInt {
	public static void main (String args[]) {
		int number = Integer.parseInt(args[0]);

		if (number % 2 == 0) {
			System.out.println("Yup! The number "+number+" is even!");
		} else { 
			System.out.println("Nope, the number "+number+" is odd af.");
		}
	}
}
