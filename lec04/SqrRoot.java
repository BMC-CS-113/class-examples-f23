import java.util.Scanner;

public class SqrRoot {

  public static void main(String[] args) {
 
     //ask the user for a number
      System.out.println("Give me a number, please:");

      Scanner sc = new Scanner(System.in);
      int inputNumber = sc.nextInt();
      //System.out.println(inputNumber);
     
     //then print the square root
     double sqrt = Math.sqrt(inputNumber);
     System.out.println(sqrt);

     int sqrtAsInt = (int) sqrt;
     System.out.println(sqrtAsInt);

     System.out.println(Math.round(sqrt));


     // print out sqrt to just 2 decimal places
     System.out.printf("The square root of %d is %.2f\n", inputNumber, sqrt);
  }

}
