//currently flags some operations as unsafe, but the exceptions
//it flags are from the method calls in the main. All of which are
//tried/caught in their own blocks
import java.io.*;
import java.util.*;

public class ReverseFile {
	public static void main(String[] args) {

	//creates an ArrayList of lines from a file, reverses the array
	//then feeds the array into arrayToFile along with the original file
	arrayToFile(reverseArray(fileToArray(args[0])), args[0]);

	}
	
	/**
	 * method takes a file path input and returns an 
	 * ArrayList with each line as an element of the 
	 * list. 
	 */
	public static ArrayList fileToArray (String path) {
		File inputFile = new File(path);
		ArrayList<String> lines = new ArrayList<String>();
		try {
			Scanner fileScanner = new Scanner(inputFile);
			while (fileScanner.hasNextLine()) {
				lines.add(fileScanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} finally {
			return lines;
		}
	}
	
	/**
	 * method takes an ArrayList<String> input
	 * and reverses the string in each index
	 * then returns an ArrayList 
	 */
	public static ArrayList reverseArray (ArrayList<String> input) {
		for (int i = 0; i < input.size(); i++) {
			StringBuilder j = new StringBuilder(input.get(i));
			j.reverse();
			input.set(i, j.toString());
			System.out.println(j.toString()); //to debug/view progress
		}
		return input;
	}
	
	/**
	 * method takes an ArrayList<String> as input
	 * and writes every index to a line of the 
	 * file specified as an argument
	 */
	public static void arrayToFile (ArrayList<String> input, String path) {
		File inputFile = new File(path);
		try {
			BufferedWriter buff = new BufferedWriter(new FileWriter(inputFile));
				
			for (String i: input) {
				System.out.println("Writing '"+i+"' to file.");//to debug/view progress
				buff.write(i);
				buff.newLine();
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("File not found");

		} finally {	
			System.out.println("File written");
		}
	}
}
