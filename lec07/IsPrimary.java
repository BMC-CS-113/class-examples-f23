// Adam Poliak
// 09/26/2023
// Checking if the user's color is primary


import java.util.Scanner;

public class IsPrimary {

  public static void main(String[] args) { 

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a color: ");

     String color = sc.nextLine();

     if (color.compareTo("green") == 0 ||
         color.compareTo("red") == 0 ||
         color.compareTo("yellow") == 0) {
         System.out.printf("%s is primary\n", color);
     }
     else {
         System.out.printf("%s is not primary\n", color);
     }
  }

}
