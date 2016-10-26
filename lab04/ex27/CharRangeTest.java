public class CharRangeTest {
	public static void main (String[] args) {
		
		CharRange testObject = new CharRange();
		char[] testArray = {'j', 'm', 'M', 'D', 'C', 'L', 'V', 'I', 'A', 'K', 'Z'};

		for (int i = 0; i <= (testArray.length - 1); i++) {
			boolean result1 = testObject.isCapital(testArray[i]);
			boolean result2 = testObject.isRoman(testArray[i]);
			System.out.println("Testing char: "+testArray[i]+"\nIs capitalized? "+result1+"\nIs Roman? "+result2);
		}
		
	}
}
