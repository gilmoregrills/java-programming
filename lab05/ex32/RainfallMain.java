import java.util.Scanner;

/**
 * Ask the user for month,amount pairs 
 * to update the monthly rainfall amounts.
 * Print the mean after each change.
 * Update the graph being currently displayed
 * after each change. 
 */

class RainfallMain {
	public static void main(String[] args) {

		YearlyRainfall lastYear = new YearlyRainfall();
		Scanner keyboard = new Scanner(System.in);
		String[] labels = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		lastYear.setData(lastYear.year, labels); 

		while (true) {
			System.out.println("Month: 0-11? ");
			int month = keyboard.nextInt();
			System.out.println("Amount? ");
			int amount = keyboard.nextInt();
			int newTotal = lastYear.getMonthAmount(month) + amount;
			lastYear.setMonthAmount(month, newTotal);
			double mean = lastYear.getMean();
			System.out.println("The mean is: " + mean);
			lastYear.display.repaint();

		}
	}
}
