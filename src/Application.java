import java.io.*;
import java.util.*;
	  
public class Application {

	public static void main (String [] args) throws FileNotFoundException {
		
		Dictionary test = new Dictionary();
		test.loadDictionary();	
		test.searchDictionary();
		test.printDictionary();
	}	// end main
}	// end class