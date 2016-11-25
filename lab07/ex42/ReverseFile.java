import java.io.*;
import java.util.*;

public class ReverseFile {
	public static void main(String[] args) {

	//creates an ArrayList of lines from a file, reverses the array
	//then feeds the array into arrayToFile along with the original file
	arrayToFile(reverseArray(fileToArray(args[0])), args[0]);

	}

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

	public static ArrayList reverseArray (ArrayList<String> input) {
		for (int i = 0; i < input.size(); i++) {
			StringBuilder j = new StringBuilder(input.get(i));
			j.reverse();
			input.set(i, j.toString());
			System.out.println(j.toString()); //to debug/view progress
		}
		return input;
	}

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
