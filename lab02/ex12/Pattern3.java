public class Pattern3 {
	public static void main (String[] args) {
		int rows = Integer.parseInt(args[0]);
		String output = "";
		for (int i = 1; i <= rows; i++) {
		//adds int i to the output String each loop then prints it
		//first loop adds '1' to the empty string, prints '1' 
		//second loop adds '2' to that string, and prints '12'
			output += i;
			System.out.println(output);
		}
	}
}
