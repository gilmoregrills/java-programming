public class Pattern {
	public static void main (String[] args) {
		int rows = Integer.parseInt(args[0]);

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
