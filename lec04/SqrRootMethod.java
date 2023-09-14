import java.util.Scanner;

public class SqrRootMethod {

  // Signature for square root method
  /**
  *  Takes the sqrt root of a number
  * @param int - the number we want to take the sqrt of
  * @return double - the sqrt of the input
  */
  public static double sqrt(int x) {
    return Math.sqrt(x);
  }

  public static double getPrintSqrt() {
      System.out.println("Give me a number, please:");
      Scanner sc = new Scanner(System.in);
      int inputNumber = sc.nextInt();
      double sqrt = Math.sqrt(inputNumber);
      System.out.printf("The square root of %d is %.2f\n", inputNumber, sqrt);
      return sqrt; 
  }

  public static void main(String[] args) {
     //calling method
     //String output = System.out.println("hello");
     double returnValue; 
     returnValue = getPrintSqrt(); 
     System.out.printf("The result of getPrintSqrt() was %f\n", returnValue);
  }

}
