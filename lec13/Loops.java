// Adam Poliak
// 10/24/2023
// Example using loops

public class Loops {

  /**
  * Print out the *_ pattern where the 
  * length matches the arugment
  *
  * @param num - the length of the output
  */
  public static void loopPattern(int num) {

    int count = 1;
    while (count <= num) {
      // in each iteration, print either * or _
      // if odd print star, if even print _
      if (count % 2 == 1) {
        System.out.print("*");
      }
      else {
        System.out.print("_");
      }
      count += 1;
    }
    System.out.println();
  }
 
  public static void main(String[] args) {
    loopPattern(0); // ""
    loopPattern(1); // "*"
    loopPattern(2); // *_
    loopPattern(3); // *_*

  }

}
