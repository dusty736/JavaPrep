import java.util.*;

// Regular Sort: 1/2 N **2
// Merge Sort: NlogN
// NlogN <<< N**2 with large N

public class Sorting {
   public static void main(String[] args) {
      int[] elements = {42, 3, 19, 8, 5, 2, 27, 19, 91, 86};
      Arrays.sort(elements);
      System.out.println(Arrays.toString(elements));
   }
   
   public static void selectionSort(int[] a) {
      for (int i = 0; i < a.length - 1; i++) {
         
         // find index of smallest remaining value
         int min = i;
         for (int j = j + 1; j < a.length; j++) {
            if (a[j] < a[min]) {
               min = j;
            }
         }
         
         // swap smallest value its proper place, a[i]
         swap(a, i, min);
      }
   }
}