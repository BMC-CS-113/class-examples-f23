// Adam Poliak
// 09/13/2023
// Convert Miles to KM using Scanner

import java.util.Scanner;

public class Miles2KMScanner {

  public static void main(String[] args) {

      // Come up with algorith
      // create a new scanner
      Scanner sc = new Scanner(System.in);

      // ask user for input, i.e. how many miles
      System.out.println("give me some miles, please");
      // keep track of user's input, store the input
      double miles = sc.nextDouble();

      // convert that value into KMs
      double kms = 1.6 * miles; 

      //print out the value
      System.out.println(kms);
  }
  

}
