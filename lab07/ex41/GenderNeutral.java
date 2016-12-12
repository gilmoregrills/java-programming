//too much stuff in the try block, not that cool
import java.io.*;
import java.util.*;

public class GenderNeutral {
	public static void main(String[] args) {
		
		//getting the name from the user
		String name = getName();
		//Confirming input
		System.out.println("Entered name is: "+name);
	
	        //Checking the boy names, then the girl names, printing results\
		//calling the readFile file-to-array method to create an array 
		//searchNParse to loop through
		searchNParse(name, readFile("boynames.txt"), "boys");	 
		searchNParse(name, readFile("girlnames.txt"), "girls");

	}

	/**
	 * Method takes the file path and turns each 
	 * line into an element of the output array
	 */
	public static String[] readFile(String file) {
		String[] output = new String[1000];
		try {
			//creating a BR from the file path passed as arg
			BufferedReader input = new BufferedReader(new FileReader(file));
			//try to load each line, catch errors and print trace
			for (int i = 0; i < 1000; i++) {
				try {
				output[i] = input.readLine();
				} catch (IOException e) {
				System.out.println("There's a problem with the file");
				e.printStackTrace();
				}	
			}	
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file specified");
			e.printStackTrace();
		} finally {
			return output;
		}
	}

	/**
	 * Method creates a scanner, gets name input
	 * from user, then capitalises the first 
	 * char whether or not it needs it. 
	 */
	public static String getName() {
		Scanner input = null;
	
		input = new Scanner(System.in);
		System.out.println("Please enter a first name");
		String output = input.next();
		return output.substring(0, 1).toUpperCase() + output.substring(1);
		
	}

	/**
	 * Method takes the input name (output of 
	 * getName), the names array, and a string
	 * for the gender of the names list you're checking
	 * then checks every element of the array and 
	 * prints the results.
	 */ 
	public static void searchNParse(String name, String[] names, String gender) {
		boolean searching = true;
		int counter = 0;
		//while the name is not found (searching = true)
		//check the array[counter]. it's not found, add 1 to counter
		//once counter reaches the max array size (nowhere else to look)
		//print the not ranked message and break
		while (searching && counter < 1000) {
			if (names[counter].contains(name)) {
				System.out.println(name+" is ranked "+(counter+1)+" in popularity among "+gender+" with "+(names[counter].substring(names[counter].indexOf(" "), names[counter].length())).trim()+" namings");
				searching = false;
				continue;
			} else if (counter == 999) {
				System.out.println(name+" is not ranked among the top 1000 "+gender+" names.");
				break;
			} else {
				counter++;
			}	
		}	
	}
}
