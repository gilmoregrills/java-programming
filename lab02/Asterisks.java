public class Asterisks {
	public static void main (String[] args) {
		int rows = Integer.parseInt(args[0]);
		String stars = "";
		String spaces = "";
		for (int i = 1; i <= rows; i++) {
			stars += "*";
			for (int j = 0; j == (rows - i); ++j) {
		      	spaces += " ";
			}
			System.out.print(spaces+stars+"\n");	
		}

	}
}

