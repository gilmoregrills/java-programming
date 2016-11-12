/**
 *  A class that represents a student
 *
 *@author     Ling Ma
 *@created    Jan 19, 2009
 */
public class Student {

	private String name;
	private String email;
	private int year; //year of registration to the course

	/**
	 *  Constructor
	 *
	 *@param  name, email and year of registration
	 */
	public Student(String name, String email, int year){
		this.name = name;
		this.email = email;
		this.year = year;
	}

	/**
	 *  get the name
	 *
	 *@return the name
	 */
	public String getName(){
		return name;
	}


	/**
	 *  A toString() method to give a String representation of a Student
	 *
	 *@return    The String representation of a Student
	 */
	public String toString(){
		return "Name:" + name +" Email:" + email + " Year:" + year;
	}
	
}