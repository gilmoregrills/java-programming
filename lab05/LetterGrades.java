public class LetterGrades {
	public static void main(String[] args) {
		char gradeBand = 'U';
		
		for (int i = 0; i <= args.length; i++) {
			int tmp = args[i].toString();	
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
			System.out.println("Student "+i+" score is: "+args[i]+" and grade is: "+gradeBand);
		}
	}
}