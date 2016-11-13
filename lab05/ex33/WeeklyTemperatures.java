/**
 * Class initializes an array of objects, 
 * one for each of the DayTemperatures
 * objects.
 *
 * @author Robin Yonge
 * @date 13/11/16
 */ 

public class WeeklyTemperatures {

	//instance variables:
	static DayTemperatures[] week = new DayTemperatures[7];

	/**
	 * method to add a DayTemperature array
	 * to the WeeklyTemperature array.
	 * @param i the index of the array that
	 * you want to assign the DayTemperatures
	 * array to - corresponds to the weekday.
	 * @param d the array that you want to
	 * store.
	 */
	public void setDay(int i, DayTemperatures d) {
		week[i] = d;
	}
	/**
	 * method calls the meanTemperature method 
	 * of each of the DayTemperature objects
	 * stored in the WeeklyTemperatures. 
	 */
	public double meanDailyTemperature() {
		//return the mean of all the mean daily temps
		double tmp = 0;
		for (DayTemperatures d : week) {
			tmp += d.meanTemperature();
		}
		return tmp;
	}
}
