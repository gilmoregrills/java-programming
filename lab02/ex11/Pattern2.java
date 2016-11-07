public class Pattern2 {
	public static void printPattern (int n) {
		int rows = n;

		for (int i = 1; i <= rows; i++) {
		//outer for loop specifies the number of digits in the row
		//then runs the inner for loop to print those digits before
		//incrementing by 1
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
	public static void main (String[] args) {
		int input = Integer.parseInt(args[0]);
		printPattern(input);	
	}
}
