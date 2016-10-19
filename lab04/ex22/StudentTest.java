public class StudentTest {
	
	static Student johnSmith = new Student("John Smith", "Male", 1985);
	static Student robinYonge = new Student("Robin Yonge", "Male", 1993);


	public static void main (String[] args) {
			
		System.out.println("Name of student is: "+johnSmith.name);
		johnSmith.register();

		System.out.println("Name of student is: "+robinYonge.name);
		robinYonge.register();
	}
}	
