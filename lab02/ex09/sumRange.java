public class sumRange {
	public static void main (String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		boolean valid = (start < end);
		int sum = 0;
		if (valid) {
			//was initially sum += start; start++; but that was dumb 
			for (int i = start; i <= end; i++) {
				sum += i;
			};
			System.out.println("The sum of all the integers in the given range is: "+sum+".");

		} else {
			System.out.println("The second number in the range must be greater than the first");
		}
	}
}
