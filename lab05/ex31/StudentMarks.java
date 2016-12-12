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
	 *  method returns the last instance of the
	 *  highest of the students marks 
	 */
	public double highestMark() {
		double tmp = 0;
		int counter = 0;
		for (int i = 0; i < marks.length; i++) {
		//for (double d : marks) {
		//	tmp = (d > tmp) ? tmp = d : tmp;#
			if (marks[i] >= tmp) {
				tmp = marks[i];
			        counter = i;
			}	       
		}
		return counter;
	}
	
	/**
	 * same as highestMark but instead it only
	 * returns the first instance
	 */
	public double otherHighestMark() {
		double tmp = 0;
		int counter = 0;
		for (int i = 0; i < marks.length; i++) {
		//for (double d : marks) {
			//tmp = (d == tmp) ? tmp = d : tmp;
			if (tmp < marks[i]) {
				tmp = marks[i];
				counter = i;
			} 
		}
		return counter;
	}


}
