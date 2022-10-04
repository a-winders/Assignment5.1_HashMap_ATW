import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


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
		System.out.println("----------------------------------------------------------\nLoads dictionary hashmap with archaic words & definitions\n----------------------------------------------------------");
		while (scan.hasNextLine()) { //prints .txt file words & definitions
			String data = scan.nextLine();// scans each line of .txt file
			String [] newData = data.split("\t"); // splits words from definitions by using tab as argument
			System.out.println("HashKey = "+newData[0].hashCode()); // displays HashCode value for key
			System.out.println("key = " +newData[0]); // displays key as a String
			System.out.println("value = "+newData[1]+"\n"); // displays value as a String
			
			dictionary.put(newData[0].hashCode(), newData[1]); // places 
			
		} // end while
		scan.close(); //closes scanner object
	
	} // end loadDictionary
	
	/*
	 * Searches the dictionary HashMap for 5 words
	 */
	public void searchDictionary() {
	
//		dictionary.get(-160421929);
//		dictionary.get(-160421929);
//		dictionary.get(-1961954197);
//		dictionary.get(94940856);
		
		System.out.println("---------------------------------------------------------\nSearches for 5 words. Prints HashKey, word, & definition\n---------------------------------------------------------");
		System.out.println
		("Hashkey: 150572795\n"+"Word: pistoleer\n"+"Definition: "+dictionary.get(150572795)
		+"\n\n"
		+"Hashkey: -160421929\n"+"Word: otherwhere\n"+"Definition: "+dictionary.get(-160421929)
		+"\n\n"
		+"Hashkey: 1465404403\n"+"Word: morrow,the\n"+"Definition: "+dictionary.get(1465404403)
		+"\n\n"
		+"Hashkey: -1961954197\n"+"Word: lordling\n"+"Definition: "+dictionary.get(-1961954197)
		+"\n\n"
		+"Hashkey: 94940856\n"+"Word: cruse\n"+"Definition: "+dictionary.get(94940856)+"\n");

		
	} // end searchDictionary

	/*
	 * Prints all unsorted dictionary keys and definitions in the hash map
	 */
	public void printDictionary() {
		System.out.println("----------------------------------\nPrints all hash keys & values\n----------------------------------");
		for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}	// end for
	} // end printDictionary
	
} // end class