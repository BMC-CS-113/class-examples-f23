// Adam Poliak
// 10/24/2023
// Compute the sum of numbers using a loop

import java.util.Scanner;

public class Sum {

  public static int askForNumber() {
    System.out.println("Give me a number");
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  } 

  public static void main(String[] args) {
    //ask a user for a number 6 times
    /*
    int num1 = askForNumber();
    int num2 = askForNumber();
    int num3 = askForNumber();
    int num4 = askForNumber();
    int num5 = askForNumber();
    int num6 = askForNumber();

    num1 + num2 + num3 + num4 + num5 + num6;
    System.out.println(askForNumber());
    // and then compute the sum
    */

    int count = 0;
    int sum = 0;
    while (count < 6) {
       int num = askForNumber();
       sum = sum + num;
       count = count + 1;
    }
    System.out.println(sum);
  }

}
