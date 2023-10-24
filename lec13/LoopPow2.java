// Adam Poliak
// 10/24/2023
// Computer powers of 2 using a loop

import java.util.Scanner;

public class LoopPow2 {

  // Computes the powers of two
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int power = sc.nextInt();

    int total = 1;
    int count = 0;

    while (count < power) { // we want to stop when count == power
      total *= 2;
      count += 1;
    }
    System.out.println(total);
  }

}
