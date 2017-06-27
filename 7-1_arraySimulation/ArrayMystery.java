/*
Original list     Final List
[6, 3]            [6, 9]
[8]               [8]
[2, 4, 6]         [2, 6, 12]
[1, 2, 3, 4]      [1, 3, 6, 10]
[7, 3, 2, 0, 5]   [7, 10, 12, 12, 17]
*/

public class ArrayMystery {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int list[] = console.nextInt[];
      mystery(list);
   }
   
   public static void mystery(int[] list) {
      for (int i = 1; i < list.length; i++) {
         list[i] = list[i] + list[i-1];
      }
   }
}