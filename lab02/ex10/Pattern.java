public class Pattern {
	public static void main (String[] args) {
		int rows = Integer.parseInt(args[0]);

		for (int i = 1; i <= rows; i++) {
		//outer for loop specifies the number of digits in the row
		//then runs the inner for loop to print those digits before
		//incrementing by 1
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			//prints out numbers starting from 1 and finishing at
			//the row number of the outer for loop
			}
			System.out.print("\n");
		}
	}
}
