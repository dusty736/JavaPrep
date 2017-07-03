import java.io.*;
import java.util.*;

public class UseList {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("mobydick.txt"));
      List<String> words = new LinkedList<String>();
      readFile(input, words);

      System.out.println("Reading the file ...");
      while (!words.isEmpty()) {
         words.remove(0);
      }
      
      System.out.println("Done");
   }
   
   public static void everyOther(List<String> words) {
      for (int i = 0; i < list.size(); i++) { // Slow for linked list
         words.remove(i);
      }
      
      Iterator<String> itr = words.iterator(); // fast for linked list
      while (itr.hasNext()) {
         itr.next();
         if (itr.hasNext()) {
            itr.next();
            itr.remove();
         }
      }
   }
   
   // ArrayList => Random Access: Can jump to indexes
   // LinkedList => Not random: Must move through lists
   
   public static void readFile(Scanner input, LinkedList<String> words) {
      System.out.println("Reading the file ...");
      while (input.hasNext()) {
         String word = input.next();
         words.add(word);
      }
   }
}