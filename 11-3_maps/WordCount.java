import java.io.*;
import java.util.*;

public class WordCount {
   public static void main(String[] args) throws FileNotFoundException {
      // map of (word, count) pairs
      Map<String, Integer> wordCounts = new HashMap<String, Integer>();
      
      Scanner input = new Scanner(new File("mobydick.txt"));
      while (input.hasNext()) {
         String word = input.next();
         
         if (!wordCounts.countainsKey(word)) {
            wordCounts.put(word, 1);
         } else {
            // existing (word, count) pair
            // "the" -> 27 --> 28
            int oldValue = wordCounts.get(word);
            wordCounts.put(word, oldValue + 1);
         }
      }
      // print all words that occur 500 times or more
      for (String word : wordCounts.keySet()) {
         int count = wordCounts.get(word);
         if(count >= 500) {
            System.out.println(word + " occurs " + wordCounts.get(word));
         }
      }      
   }
}