
import java.util.ArrayList;

/**
 *  A class that holding a list of students
 *
 *@author     
 *@date
 */
public class StudentList {

	private ArrayList<Student> list; //instance variable

	/**
	 *  Constructor
	 */
	public StudentList(){
		list = new ArrayList<Student>();
	}
	
	/**
	 *  a method to print off all ArrayList elements
	 */
	
	public void printList(){
		System.out.println("--Begin--");
		//WRITE YOUR CODE HERE
		System.out.println("--End--");
	}
	
	/**
	 *  A method to add a student to the list
	 *
	 *@param    The student
	 */
	public void addToList(Student s){
		//WRITE YOUR CODE HERE

	}

	/**
	 *  A method to remove a student from the list
	 *
	 *@param    The student
	 */
	public void removeFromList(Student s){
		//WRITE YOUR CODE HERE
	}
	
	/**
	 *  A main method to test
	 */
	public static void main(String[] args) {

		// Create an instance of the class 
		StudentList studentList = new StudentList();

		//create 3 student objects
		Student s1 = new Student("John Smith", "js@qmul.ac.uk", 2008);
		Student s2 = new Student("Tom Will", "tw@qmul.ac.uk", 2007);
		Student s3 =  //WRITE YOUR OWN DETAILS HERE
		
		//add the three students to the list
		studentList.addToList(s1);
		studentList.addToList(s2);
		studentList.addToList(s3);

		// Print the list
		studentList.printList();
			
		// Remove the student "Tom Will"
		studentList.removeFromList(s2);
		
		// Print the list again
		studentList.printList();
	}

}