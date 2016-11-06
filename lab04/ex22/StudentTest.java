public class StudentTest {

	public static void main (String[] args) {
			
		Student johnSmith = new Student("John Smith", "Male", 1985);
		Student robinYonge = new Student("Robin Yonge", "Male", 1993);

		System.out.println("Name of student is: "+johnSmith.name);
		johnSmith.register();

		System.out.println("Name of student is: "+robinYonge.name);
		robinYonge.register();
	}
}	
