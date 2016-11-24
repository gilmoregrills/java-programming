//if you search some of the terms then you'll get a haiku!
import java.util.Scanner;
import java.io.*;

public class Find {
	public static void main(String[] args) {
		Scanner reader = null;
		try {
			//declare all the variables, create the file and Scanner objects
			String searchTerm = args[0];
			File inputFile = new File(args[1]);
			String line = "";
			int lineNumber = 0;
			reader = new Scanner(inputFile);
			
			//loop through the lines text in the file
			while (reader.hasNextLine()) {
				//assign the current line to the line var
				line = reader.nextLine();
				//add 1 to the line number counter
				lineNumber++;
				//check if the line contains the search term, if yes print it
				if (line.contains(searchTerm)) {
					System.out.println("file: "+inputFile.getName()+" | line: "+lineNumber+" | "+line);
				}	
			}	

		} catch (FileNotFoundException e) {
			System.out.println("Problem opening/reading file");
			e.printStackTrace();
		} finally {
			reader.close();
		}
			
	}
}
