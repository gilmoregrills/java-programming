public class CharRange {
	
	public boolean isCapital (char a) {
		
		char input = a;

		if (Character.isUpperCase(input)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isRoman (char b) {

		boolean output = false;
		char input = b;
		char[] roman = {'m', 'd', 'c', 'l', 'v', 'i'};

		for (int i = 0; i <= (roman.length - 1); i++) {
			if (input == roman[i]) {
				output = true;
			}

		}
		return output;
	}
}
