// Adam Poliak
// 09/28/2023
// Practice with arrays

//Write a program, Backwards.java, 
//that asks the user for 3 integers and 
//then prints the list of numbers in reverse order

import java.util.Scanner;

public class Backwards {

  public static void main(String[] args) {

    int[] numbs = new int[3];
    System.out.printf("%d, %d, %d\n", numbs[2], numbs[1], numbs[0]);

    String[] strs = new String[3];
    System.out.printf("%s, %s, %s\n", strs[2], strs[1], strs[0]);

    Scanner sc = new Scanner(System.in);
    numbs[0] = sc.nextInt();
    numbs[1] = sc.nextInt();
    numbs[2] = sc.nextInt();
    System.out.printf("%d, %d, %d\n", numbs[2], numbs[1], numbs[0]);

  }

}
