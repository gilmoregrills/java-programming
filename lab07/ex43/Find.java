//if you search some of the terms then you'll get a haiku!
import java.util.Scanner;
import java.io.*;

public class Find {
	public static void main(String[] args) {
		parseArgs(args);
		//searchFile(searchTerm, filePath);
		//if (outputFile exists) { writeFile(searchFileResults[]) }	

			
	}
	public static void parseArgs (String[] args) {
		//parse the arguments so you know what the search terms are and what the filepaths are
		//as well as the path of potential output files, return what?
		//possible that this could all live inside of main()
	}

	public static void searchFile(String searchTerm, String filePath) {//change so that it takes String[] filePaths
			Scanner reader = null; //declared to fit the finally statement
		try {
			//declare all the variables, create the file and Scanner objects
			File inputFile = new File(filePath);
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
					//if there is to be an output file, add this to an array?
				}	
			}	

		} catch (FileNotFoundException e) {
			System.out.println("Problem opening/reading file");
			e.printStackTrace();
		} finally {
			reader.close();
		}
			
	}
	public static void writeFile(String[] results) {
		//loop through the contents of results, writing it all to a file
	}
}
