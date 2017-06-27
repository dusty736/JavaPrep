// This program takes a scanner containing an input file
// as a parameter and that echose the input with certain lines 
// underlined.  The lines underlined begin with a period.

import java.io.*;
import java.util.*;

public class expandFile {
   public static void main(String[] args) 
          throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      Scanner input = getInput(console);
      PrintStream output = new PrintStream(new File("updatedFile.txt"));
      testLine(input,output);
   }
   
   // This method reads in a scanner input, and makes it so
   // if the file is not found, the user can try again.  Robust.
   public static Scanner getInput(Scanner console) 
          throws FileNotFoundException {
      System.out.print("Input file name? ");
      File f = new File(console.nextLine());
      while (!f.canRead()) {
         System.out.println("File not found.  Try again.");
         System.out.print("Input file name? ");
         f = new File(console.nextLine());
      }
      return new Scanner(f);
   }

   public static void testLine(Scanner input, PrintStream output) {      
      while (input.hasNextLine()) {
         String line = input.nextLine();
         if (line.length() > 0 && line.startsWith(".")) {
            output.println(line.substring(1));
            for (int i = 1; i <= line.length() - 1; i++) {
               output.print("-");
            }
            output.println();
         } else {
            output.println(line);
         }

      }
   }
   
}