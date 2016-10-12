public class Week {
	public static void main (String[] args) {
		int day = Integer.parseInt(args[0]);
		String dayName;
		switch (day) {
			case0: dayName = "Monday";
			       break;
			case1: dayName = "Tuesday";
			       break;
			case2: dayName = "Wednesday";
			       break;
			case3: dayName = "Thursday";
			       break;
			case4: dayName = "Friday";
			       break;
			case5: dayName = "Saturday";
			       break;
			case6: dayName = "Sunday";
			       break;
			}
		System.out.println("The day is"+dayName);
	}
}

				
