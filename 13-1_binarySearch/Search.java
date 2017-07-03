import java.util.*;

public class Search {
   public static void main(String[] args) {
      //    index       0 - 15
      int[] elements = {-5, -3, 0, 1, 3, 6, 7, 8, 10, 11, 15, 19, 25, 38, 47, 91};
      //int index = Arrays.binarySearch(elements, 19);
      int index = binarySearch(elements, 19);
      System.out.println("19 is found at index " + index);
   }
   
   //public static int binarySearch(int[] elements, int target) {
   public static int binarySearch(String[] elements, int target) {   
      int min = 0;
      int max = elements.length - 1;
      
      while (min <= max) {
         int mid = (min + max) / 2;
         if (elements[mid].compareTo(target) < 0) {
         //if (elements[mid] < target) {
            // too small; go right
            min = mid + 1;
         //} else if (elements[mid] > target) {
         } else if (elements[mid].compareTo(target) > 0) {

            max = mid - 1;
         } else {
            return mid;
         }
      }
      return -1;
   }
}