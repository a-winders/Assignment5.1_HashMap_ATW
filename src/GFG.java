/** Class to demonstrate how you can import .txt to HashMap.
 * @author Taken from https://www.geeksforgeeks.org/reading-text-file-into-java-hashmap/
 */

import java.io.*;
import java.util.*;
  
class GFG {
    final static String filePath = "C:/Users/alpha/OneDrive - Bellarmine University/Project_Workspace/Assignment5.1_HashMap_ATW/DictionaryWordValuePairs.txt";
    public static void main(String[] args)
    {
  
        // read text file to HashMap
        Map<String, String> mapFromFile
            = HashMapFromTextFile();
  
        // iterate over HashMap entries
        for (Map.Entry<String, String> entry :
             mapFromFile.entrySet()) {
            System.out.println(entry.getKey() + "   "
                               + entry.getValue());
        }
    }
  
    public static Map<String, String> HashMapFromTextFile()
    {
  
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader br = null;
  
        try {
  
            // create file object
            File file = new File(filePath);
  
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split(" : ");
  
                // first part is name, second is number
                String name = parts[0].trim();
                String number = parts[0].trim();
  
                // put name, number in HashMap if they are
                // not empty
                if (!name.equals("") && !number.equals(""))
                    map.put(name, number);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
  
            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }
  
        return map;
    }
}