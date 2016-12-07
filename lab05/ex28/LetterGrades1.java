import java.util.ArrayList;
import java.util.Arrays;

public class LetterGrades1 {
	public static void main(String[] args) {
		//gradeBand is instantiated and by default set to 'U'
		char gradeBand = 'U';
		//converts the args[] to ArrayList
		ArrayList<String> stringList = new ArrayList(Arrays.asList(args));
			
		for (int i = 0; i < stringList.size(); i++) {
			int tmp = Integer.parseInt(stringList.get(i));	
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
