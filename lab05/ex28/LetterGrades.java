public class LetterGrades {
	public static void main(String[] args) {
		//gradeBand is instantiated and by default set to 'U'
		char gradeBand = 'U';
		//loop through each element of the args array, add it to
		//a temp var for ease of understanding and check which
		//grade band it fits into 
		for (int i = 0; i < args.length; i++) {
			int tmp = Integer.parseInt(args[i]);	
			if (tmp >= 50 && tmp < 55) {
				gradeBand = 'D';
			} else if (tmp >= 55 && tmp < 60) {
			       gradeBand = 'C';	
			} else if (tmp >= 60 && tmp < 70) {
				gradeBand = 'B';
			} else if (tmp >= 70) {
				gradeBand = 'A';
			} else if (tmp < 50) {
				gradeBand = 'U';
			}
			System.out.println("Student "+i+" score is: "+tmp+" and grade is: "+gradeBand);
		}
	}
}
