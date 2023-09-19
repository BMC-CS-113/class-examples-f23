// Adam Poliak
// 09/19/2023
// Method for computing the dsistance between a char and a

public class LetterStaty {

  /**
    Computes how far away a letter is from a
    @param char - the letter to consideer
    @return int - the distance from letter to a
  */
  public static int distanceFromA(char letter) {
    int distance = letter - 'a';
    return distance;
  }

  public static void main(String[] args) {
    /*
    System.out.printf("The value of a as an int is %d\n", (int) 'a');
    System.out.printf("The value of a as an int is %d\n", (int) 'b');
    System.out.printf("The distance is: %d\n", 'b' - 'a');
    */
    System.out.println(distanceFromA('a')); // should return 0
    System.out.println(distanceFromA('z')); // should return 25
    System.out.println(distanceFromA('h')); // should return 7
  }

}
