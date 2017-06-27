// Give a file hours.txt with some contents:
// id, name, hours list
// This computes the hours worked, average hours/day for each
// worker

import java.io.*;
import java.util.*;

public class HoursWorked {
   public static void main(String[] args) 
          throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      Scanner input = getInput(console);
      PrintStream output = new PrintStream(new File("WorkReport.txt"));
      System.out.print("Enter an ID: ");
      int idSearch = console.nextInt();
      System.out.println();
      Search(input, idSearch);
      outputData(input,output);
   }
   
   // This method reads in a scanner input, and makes it so
   // if the file is not found, the user can try again.  Robust.
   public static Scanner getInput(Scanner console) 
          throws FileNotFoundException {
      System.out.print("Input file name? ");
      File f = new File(console.nextLine());
      while (!f.canRead()) {
         System.out.println("File not found.  Try again.");
         System.out.print("Input file name? ");
         f = new File(console.nextLine());
      }
      return new Scanner(f);
   }

   // This method calculates the hours/day of each employee
   public static double rate(double totalHours, int daysWorked) {
      double rate = totalHours / daysWorked;
      return rate;
   }
   
   // This method processes the text file
   public static void Search(Scanner input, int searchID) {
      boolean match = false;
      while (input.hasNextLine()) {
         String employeeInfo = input.nextLine();
         Scanner line = new Scanner(employeeInfo);
         int id = line.nextInt();
         if (id == searchID) {
            match = true;
            String name = line.next();
            double totalHours = 0;
            int daysWorked = 0;
            while (line.hasNextDouble()) {
               daysWorked++;      
               totalHours += line.nextDouble();
            }
            double hoursPerDay = rate(totalHours, daysWorked);
            //output.printf("%s worked %.2f hours (%.2f hours/day)", name, totalHours, hoursPerDay);
            //output.println();
            System.out.printf("%s worked %.2f hours (%.2f hours/day)", name, totalHours, hoursPerDay);
            System.out.println();
         }
      }
      if (!match) {
         System.out.printf("ID #%d not found", searchID);
      }
   }
   
   public static void outputData(Scanner input, PrintStream output) {
      while (input.hasNextLine()) {
         String employeeInfo = input.nextLine();
         Scanner line = new Scanner(employeeInfo);
         int id = line.nextInt();
         String name = line.next();
         double totalHours = 0;
         int daysWorked = 0;
         while (line.hasNextDouble()) {
            daysWorked++;      
            totalHours += line.nextDouble();
         }
         double hoursPerDay = rate(totalHours, daysWorked);
         output.printf("%s worked %.2f hours (%.2f hours/day)", name, totalHours, hoursPerDay);
         output.println();
      }
   }
}