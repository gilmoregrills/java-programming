
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
		for (Student i : list) {
			System.out.println(i.toString());
		}
		System.out.println("--End--");
	}
	
	/**
	 *  A method to add a student to the list
	 *
	 *@param    The student
	 */
	public void addToList(Student s){
		list.add(s);
		System.out.println(s.getName()+" has been added to the list");
	}

	/**
	 *  A method to remove a student from the list
	 *
	 *@param    The student
	 */
	public void removeFromList(Student s){
		list.remove(s);
		System.out.println(s.getName()+" has been removed from the list");
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
		Student s3 = new Student("Robin Yonge", "ry@qmul.ac.uk", 2016);
		
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
