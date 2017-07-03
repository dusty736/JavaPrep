import java.io.*;
import java.util.*;

/*
HashSet: Implemented using a "hash table" array;
very fast: O(1) for all operations
elements are stored in unpredictabl order

TreeSet: Implemted using a "binary search tree";
pretty fast: O(logN) for all operations
elements are stored in sorted order.
*/

public class CountWords {
   public static void main(String[] args) throws FileNotFoundException {
      Set<String> words = new TreeSet<String>();
      
      Scanner input = new Scanner(newFile("mobydick.txt"));
      while (input.hasNext()) {
         String word = input.next();
      }
      
      System.out.println(words.size() + " unique words.");
      for (String word : words) {
         System.out.println(word); // sets don't have indexes
      }
   }
}