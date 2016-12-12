/**
 * A test class for StudentMarks.java.
 *
 * @author Robin Yonge
 * @date 13/10/16
 */
public class StudentMarksMain {
	public static void main(String[] args) {
	
	StudentMarks testStudent = new StudentMarks();

	testStudent.setMark(0, 56);
	testStudent.setMark(1, 76);
	testStudent.setMark(2, 90);
	testStudent.setMark(3, 72);
	testStudent.setMark(4, 45);
	testStudent.setMark(5, 90);
	testStudent.setMark(6, 87);

	System.out.println("This student's mark for their third assignment is: "+testStudent.getMark(3));
	System.out.println("This student's overall average mark is: "+testStudent.meanMark());
	System.out.println("This student's highest mark was on assessment: "+testStudent.highestMark());
	System.out.println("This student got the same mark on another assessment: "+testStudent.otherHighestMark());

	
	}
}
