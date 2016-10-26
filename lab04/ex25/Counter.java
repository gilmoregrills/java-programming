/**
 * Class allows you to easily set a starting int
 * and count up or down from it and up to a maximum.
 * @author Robin Yonge
 * @Version 1.0
 */
public class Counter {
	private	int count = 0;
	private int max = 10;
	/**
	 * The constuctor doesn't take any arguments, 
	 * values of count and max can be set using
	 * the setMax() and setCount() methods.
	 */	
	public Counter() {
	}
	
	/**
	 * This method returns the value of count.
	 */
	public int getCount() {
		return count;
	}
	/**
	 * This method returns the value of max.
	 */	
	public int getMax() {
	       return max;
	}
	/**
	 * This method sets the value of count to 
	 * whatever parameter you pass.
	 * @param n The value-to-be of count.
	 */
	public void setCount(int n) {
		count = n;
	}
	/**
	 * This method sets the value of max to
	 * whatever parameter you pass.
	 * @param n The value-to-be of max.
	 */
	public void setMax(int n) {
		max = n;
	}
	/**
	 * This will increment the value of count
	 * by 1, unless count has already reached
	 * the max, in which case it resets to 0.
	 */
	public void increase() {
		if (count < max) {
			count++;
		} else {
			count = 0;
		}
	}
	/**
	 * This will decrement the value of count
	 * by 1, unless count is already 0, in
	 * which case it remains the same.
	 */
	public void decrease() {
		if (count > 0) {
			count--;
		} else {
			
		}
	}
	/**
	 * This will reset the value of count to
	 * 0, and print a confirmation.
	 */
	public void reset() {
		count = 0;
		System.out.println("Counter Reset!");
	}
	/**
	 * This method returns as a string the 
	 * value of any int passed as a parameter,
	 * @param i The integer to be passed, can
	 * be Counter.count or Counter.max.
	 */ 
	public String toString(int i) {
		return Integer.toString(i);
	}
}
