/**
 * Class creates an array that stores the rainfall
 * amount for each month, also initialises a graph
 * to display that data.
 *
 * @author Robin Yonge
 * @date 13/11/16
 */

class YearlyRainfall {
	//instance variables
	int[] year = new int[12];
	RainfallDisplay display = new RainfallDisplay();
	/**
	 * method sets the array of month data to pull
	 * from as well as the labels under the X axis
	 * by pulling data from a String array.
	 * @param d the int[] array of data-per-month.
	 * @param labels the String[] array of month names.
	 */
	public void setData(int[] d, String[] labels) {
		// Set display data	
		display.setData(d);
		display.setBarLabels(labels);
	}
	/**
	 * method repaints the already existing graph
	 * updating the data.
	 */	
	public void refreshData() {
		display.repaint();
	}
	/**
	 * constructor
	 */
	public YearlyRainfall() {
	}
	/**
	 * method returns the amount of rainfall in 
	 * a given month.
	 * @param month the number representing the 
	 * index of that month from 0-11.
	 */
	public int getMonthAmount(int month) {
		return year[month];
	}
	/**
	 * method sets the amount of rainfall for a 
	 * given month.
	 * @param month the int index representing the 
	 * index of that month from 0-11.
	 * @param amount the int representing the amount
	 * of rainfall that fell in that month. 
	 */
	public void setMonthAmount(int month, int amount) {
		year[month] = amount;
	}
	/**
	 *  method returns a double value that 
	 *  represents the mean of all the data in the
	 *  year array.
	 */
	public double getMean() {
		double tmp = 0;
		for (int month : year) {
			tmp += month;
		}
		return (tmp / (year.length - 1));
	}

}
