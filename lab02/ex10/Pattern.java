public class Pattern {
	public static void main (String[] args) {
		int rows = Integer.parseInt(args[0]);
                
		for (int i = 1; i <= rows; i++) {
		//outer for loop specifies the number of digits in the row
		//then runs the inner for loop to print those digits before
		//incrementing by 1
		        int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			//prints out numbers starting from 1 and finishing at
			//the value of i in the outer for loop
			}
			System.out.print("\n");
		}
	}
}
