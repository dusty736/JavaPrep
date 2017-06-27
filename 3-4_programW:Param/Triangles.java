import java.util.*;

public class Triangles {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Triangle size?");
      int triangleSize = console.nextInt();
      drawTriangle(triangleSize);
   }
   
   public static void drawTriangle(int size) {
      for (int i = 1; i <= size; i++) {
         whiteSpace(size - i);
         for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
         }
         whiteSpace(size - i);
         // printString(" ", -1 * i + size);
         // printString("*", 2 * i - 1);
         // printString(" ", -1 * i + size);
         System.out.println();
      }
   }
         
   public static void whiteSpace(int size) {
      for (int j = size - 1; j >= 0; j--) {
            System.out.print(" ");
      }
   }
   
   // public static void printString(String s, int times) {
   //    for (int i = 1; i <= times; i++) {
   //       System.out.print(s);
   //    }
   // }
}