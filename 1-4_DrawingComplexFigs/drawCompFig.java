public class drawCompFig {
   public static void main(String[] args) {
      hex();
      botHex();
      stopSign();
      topHex();
   }
   
   public static void hex() {
   
      top();
      smallTop();
      largeTop();
      largeBottom();
      smallBottom();
      System.out.println();
   }   
      
   public static void botHex() {
      largeBottom();
      smallBottom();
      floor();
      System.out.println();
   }
      
   public static void stopSign() {
      top();
      smallTop();
      largeTop();
      middle();
      largeBottom();
      smallBottom();
      System.out.println();     
   }   
    
   public static void topHex() {
      top();
      smallTop();
      largeTop();
      floor();
      System.out.println(); 
   }    

   
   public static void top() {
      System.out.println("  ______  ");
   }
   
   public static void smallTop() {
      System.out.println(" /      \\ ");
   }
   
   public static void smallBottom() {
      System.out.println(" \\______/ ");
   }

   public static void largeTop() {
      System.out.println("/        \\");
   }
   
   public static void largeBottom() {
      System.out.println("\\        /");
   }
   
   public static void floor() {
      System.out.println("+--------+");
   }
   
   public static void middle() {
      System.out.println("|  STOP  |");
   }      
}