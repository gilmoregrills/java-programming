public class sumRange {
	public static void main (String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		boolean valid = (start < end);
		int sum = 0;
		if (valid) {
			for (int i = start; i <= end; i++) {
				sum += start;
				start++;
			};
			System.out.println("The sum of all the integers in the given range is: "+sum+".");

		} else {
			System.out.println("This is not a valid range.");
		}
	}
}
