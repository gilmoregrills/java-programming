/**
 * Class stores an array with 24 indexes
 * that can be used to record hourly 
 * temperature readings throughout the day.
 *
 * @author Robin Yonge
 * @date 13/11/16
 */
public class DayTemperatures {
	
	//instance variables:
	double[] temps = new double[24];
	
	/**
	 * method sets the temperature for
	 * the given index (the hour of the
	 * day-1).
	 * @param i the index to assign the value to.
	 * @param d the recorded temperature.
	 */
	public void setTemperature(int i, double d) {
	       temps[i] = d;
	}	       
	/**
	 * method returns an array of the 
	 * hottest hours.
	 * @param i the number indexes in 
	 * the returned array. 
	 */
	//public int[] hottestHours(int i) {
		//find the hottest hours and put them in int array
//	}
	/**
	 * method returns the mean of all
	 * of the day's temperatures.
	 */
	public double meanTemperature() {
		double tmp = 0;
		for (double d : temps) {
			tmp =+ d;
		}
		return (tmp / temps.length - 1);
	}

}
