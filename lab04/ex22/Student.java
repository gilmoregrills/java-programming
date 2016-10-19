
public class Student {

	String name;
	String gender;
	int yearOfBirth;

	public static void register() {
		System.out.println("You have been registered");	
	}
	
	//constructor	
	public Student(String a, String b, int c) {
		name = a;
		gender = b;
		yearOfBirth = c;	
	}
}

