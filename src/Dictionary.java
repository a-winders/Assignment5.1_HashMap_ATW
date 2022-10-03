import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


// "DictionaryWordValuePairs.txt"


/**
 * Class meant to return words from a dictionary by using Hash Maps.
 * @author Adam Winders
 *
 */
public class Dictionary {	

	HashMap<Integer, String> dictionary = new HashMap<Integer, String>();	// Creates HashMap called "dictionary"
	
	/*
	 * Loads words & definitions from .txt to HashMap
	 */
	public void loadDictionary() throws FileNotFoundException {
		
		File file = new File("DictionaryWordValuePairs.txt"); // Creates File object called "file"
		Scanner scan = new Scanner(file); // creates new Scanner object
	
		while (scan.hasNextLine()) { //prints .txt file words & definitions
			String data = scan.nextLine();// scans each line of .txt file
			String [] newData = data.split("\t"); // splits words from definitions by using tab as argument
			System.out.println("key = " +newData[0]); // displays key as a String
			System.out.println("key HashCode = "+newData[0].hashCode()); // displays HashCode value for key
			System.out.println("value = "+newData[1]+"\n"); // displays value as a String
			
			dictionary.put(newData[0].hashCode(), newData[1]); // places 
			
		} // end while
		scan.close(); //closes scanner object
	
	} // end loadDictionary
	
	
	public void searchDictionary() {
	} // end searchDictionary

	public void printDictionary() {
	} // end printDictionary
	
} // end class