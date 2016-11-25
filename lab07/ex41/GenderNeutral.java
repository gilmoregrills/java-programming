import java.io.*;
import java.util.*;

public class GenderNeutral {
	public static void main(String[] args) {
		
		//creating the two mega-arrays of names/numbers
		//String[] boys = readFile("/home/gilmoregrills/literally-nothing-at-all/lab07/ex41/boynames.txt");
		//String[] girls = readFile("/home/gilmoregrills/literally-nothing-at-all/lab07/ex41/girlnames.txt");

		//getting the name from the user
		String name = getName();
		//Confirming input
		System.out.println("Entered name is: "+name);
	
	        //Checking the boy names, then the girl names, printing results\
		//calling the file-to-array method as the String[] arg in searchNParse
		searchNParse(name, readFile("/home/gilmoregrills/literally-nothing-at-all/lab07/ex41/boynames.txt"), "boys");	 
		searchNParse(name, readFile("/home/gilmoregrills/literally-nothing-at-all/lab07/ex41/girlnames.txt"), "girls");

	}
	public static String[] readFile(String file) {
		String[] output = new String[1000];
		//had to be declared above b/c scope, feel like it should work
		//to have it declared in the try and use it in the finally tho
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
	public static String getName() {
		Scanner input = null;
	
		input = new Scanner(System.in);
		System.out.println("Please enter a first name");
		//store input in a var named output
		String output = input.next();
		//line capitalizes the first letter whether or not it needs it pre-return
		return output.substring(0, 1).toUpperCase() + output.substring(1);
		
	}
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
