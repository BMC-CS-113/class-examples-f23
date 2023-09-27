// Adam Poliak
// 09/26/2023
// Recursive factorial

public class Factorial {

  public static int factorial(int number) {

     // base case
     if (number == 0) {
       return 1;
     }
     // rule
     // solve one subproblem, and punt the rest down the road
     // punt the rest down the road - call the method recursively
     return number * factorial(number - 1);

  }


  public static void main(String[] args) { 
     System.out.println(factorial(4) == 24);
     System.out.println(factorial(4));
     System.out.println(factorial(5) == 24*5);
     System.out.println(factorial(5));
     System.out.println(factorial(10) == 10*9*8*7*6*5*4*3*2);
    

  }

}
