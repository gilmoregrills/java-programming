public class Pattern3 {
	public static void main (String[] args) {
		int rows = Integer.parseInt(args[0]);
		String output = "";
		for (int i = 1; i <= rows; i++) {
			output += i;
			System.out.println(output);
		}
	}
}
