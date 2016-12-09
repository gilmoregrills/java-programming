import java.util.*;

public class Reverser {
	public static void main(String[] args) {
		String[] strArray = {"Pardon", "me", "are", "you", "Aaron", "Burr", "sir?"};
		Integer[] intArray = {1, 3, 5, 7, 9};

		reverse(intArray);
		reverse(strArray);

		System.out.println(Arrays.toString(intArray)+"\n"+Arrays.toString(strArray));	
	}
//	maybe E should be T for type? 
	public static <E> void reverse(E[] inputArray) {
		for (int i = 0; i < inputArray.length / 2; i++) {
			E tmp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length - i -1];
			inputArray[inputArray.length - i - 1] = tmp;
		}
	}
}
