public class MonthConverter {
	public static void main (String args[]) {
		int month = Integer.parseInt(args[0]);
		String[] monthsArray = {"not a month, dummy", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println("Month "+month+" is "+monthsArray[month]+".");
	}
}
