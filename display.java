import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class display extends register{

    public static void registerDisplay (int select) throws FileNotFoundException {
  // Open the data file with information of products
  FileReader fr = new FileReader("datalist.txt");

  // intialize String line 
  String line="";

  // integer s is set for which line of the data file the datalist should read from 
  

  try (Scanner inFile = new Scanner(fr)) {
      // will do a loop to skip the lines that are not needing to be output from the datalist
      while (select>0){
          line = inFile.nextLine();
          select--;
      }

      // will output the correct line from the datalist for this factory 
      System.out.println(line);
      
  }
}


    }
 
    


