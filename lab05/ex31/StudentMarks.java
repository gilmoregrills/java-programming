/**
 * A class that holds an array of student's
 * marks.
 *
 * @author Robin Yonge
 * @date 13/10/16
 */
public class StudentMarks {
	
	double[] marks = new double[7]; //instance variable
	/**
	* accessor method that returns a specified mark.
	*/
	public double getMark(int i) {
		return marks[i];
	}
	/**
	 * mutator method that logs a mark to the array.
	 */
	public void setMark(int i, double d) {
		marks[i] = d;
	}
	/**
	 * method returns the mean value of the student's marks.
	 */
	public double meanMark() {
		double mean = 0;
		for (double d : marks) {
			mean += d;
		}
		return (mean / (marks.length));
	}

	/**
	 *  method returns the highest of the student's 7 marks. 
	 */
	public double highestMark() {
		double tmp = 0;
		for (double d : marks) {
			tmp = (d > tmp) ? tmp = d : tmp;
		}
		return tmp;
	}
}
