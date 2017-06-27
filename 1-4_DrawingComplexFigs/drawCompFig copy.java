// This program draws several text figures.
// It uses static methods to capture structure and
// eliminate redundancy
public class drawCompFig {
   public static void main(String[] args) {
      hex();
      downHex();
      stopSign();
      upHex();
   }
   
   public static void hex() {
      /*
      Produce a hexagon  
      */
      topHex();
      bottomHex();
      System.out.println();
   }   
      
   public static void downHex() {
      /*
      Produces the bottom half of a hexagon with a floor
      */
      bottomHex();
      floor();
      System.out.println();
   }
      
   public static void stopSign() {
      /*
      Produces a stop sign  
      */
      topHex();
      System.out.println("|  STOP  |");
      bottomHex();
      System.out.println();     
   }   
    
   public static void upHex() {
      /*
      Produce the top half of a hexagon with a floor
      */
      topHex();
      floor();
      System.out.println(); 
   }    

   
   public static void topHex() {
      /*
      Produce the top half of a hexagon
      */
      System.out.println("  ______  ");
      System.out.println(" /      \\ ");
      System.out.println("/        \\");
   }
   
   public static void bottomHex() {
      /*
      Produce the bottom half of a hexagon
      */
      System.out.println("\\        /");
      System.out.println(" \\______/ ");
   }
   
   public static void floor() {
      /*
      Produce a floor with a plus, 8 minus, and a plus
      */
      System.out.println("+--------+");
   }     
}