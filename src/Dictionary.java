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

	HashMap<String, String> dictionary = new HashMap<String, String>();	// Creates HashMap called "dictionary"
	

	/*
	 * Loads words & definitions from .txt to HashMap
	 */
	public void loadDictionary() throws FileNotFoundException {
		
		File file = new File("DictionaryWordValuePairs.txt"); // Creates File object called "file"
		Scanner scan = new Scanner(file); // creates new Scanner object
		
		while (scan.hasNextLine()) { //prints .txt file words & definitions
			String data = scan.nextLine();
			System.out.println(data);
		} // end while
		scan.close(); //closes scanner object
	} // end loadDictionary
	
	
	public void searchDictionary() {
	} // end searchDictionary

	public void printDictionary() {
	} // end printDictionary
	
} // end class