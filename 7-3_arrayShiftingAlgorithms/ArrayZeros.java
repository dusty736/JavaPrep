// This program imputs array and outputs and array with 
// all zeros moved to the end

import java.io.*;
import java.util.*;

public class ArrayZeros {
   public static void main(String[] args) {
      int[] array1 = {1,3,8,0,19,24,0,7,2,0};
      System.out.println("Before removeZeros: " + Arrays.toString(array1));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array1))); 
      
      int[] array2 = {7,3, 0, 4, 6, 0, 0, 13, 0, 78, 0, 0, 19};
      System.out.println("Before removeZeros: " + Arrays.toString(array2));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array2)));
      
      int[] array3 = {1, 2, 3, 4, 5};
      System.out.println("Before removeZeros: " + Arrays.toString(array3));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array3)));
      
      int[] array4 = {1, 0, 2, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0};
      System.out.println("Before removeZeros: " + Arrays.toString(array4));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array4)));
      
      int[] array5 = {0, 0, 8, 3, 0, 0, 4, 0, 0, 7, 2, 0, 0, 18};
      System.out.println("Before removeZeros: " + Arrays.toString(array5));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array5)));
      
      int[] array6 = {0, 0, 0, 0};
      System.out.println("Before removeZeros: " + Arrays.toString(array6));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array6)));
      
      int[] array7 = {0};
      System.out.println("Before removeZeros: " + Arrays.toString(array7));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array7)));
      
      int[] array8 = {};
      System.out.println("Before removeZeros: " + Arrays.toString(array8));
      System.out.println("After removeZeros: " + Arrays.toString(removeZeros(array8)));
   }
   
   public static int[] removeZeros(int[] array) {
      /*
      int[] temp = new int[array.length];
      int count = 0;
      
      for (int i = 0; i < array.length; i++) {
         if (array[i] != 0) {
            temp[count] = array[i];
            count++;
         }
      }
      
      for (int i = 0; i < temp.length; i++) {
         array[i] = temp[i];
      }
      return array;
      */
      int count = 0;
      
      for (int i = 0; i < array.length; i++) {
         if (array[i] != 0) {
            array[count] = array[i];
            count++;
         }
      }
      
      for (int i = count; i < array.length; i++) {
         array[i] = 0;
      }
      
      return array;
   }
}