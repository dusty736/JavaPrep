public class ConvertNames {
   public static void main(String[] args) {
      System.out.println(convert("Kane, Erica"));
      System.out.println(convert("Chandler, Adam"));
      System.out.println(convert("Martin, Tadd"));
   }
   
   public static String convert(String name) {
      int split = name.indexOf(",");
      String lastName = "";
      String firstName = "";
      for (int i = 0; i <= name.length() - 1; i++) {
         if (i < split) {
            lastName += name.charAt(i);
         } else if (i > split + 1) {
            firstName += name.charAt(i);
         }
      }
      
      // Other Method
      // String lastName = name.substring(0, split);
      // String firstName = name.substring(split + 2, name.length());
      return firstName + " " + lastName.toUpperCase();
   }
}