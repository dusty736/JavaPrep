// This program draws a complex figure using nested for loops.
public class LoopFigure {
   public static final int length = 64;
   public static final int numLine = length / 4 + 1;
   public static void main(String[] args) {
      for (int line = 1; line <= numLine; line++) {
         for (int i = 1; i <= length - ((line - 1) * 4); i++) {
            System.out.print("/");
         }
         for (int j = 1; j <= (line - 1) * 8; j++) {
               System.out.print("*");
         }
         for (int i = 1; i <= length - ((line - 1) * 4); i++) {
            System.out.print("\\");
         }
         System.out.println();
      }
   }
} 