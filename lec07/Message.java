// Adam Poliak
// 09/26
// solve infinite recursion from last lecture

public class Message {

  public static void printMessage(String str, int remaining) {

    //base case
    if (remaining == 1) {
     //Stop
     System.out.println(str);
     return;
    }

    System.out.println(str);
    System.out.println(remaining);
    remaining = remaining - 1;
    printMessage(str, remaining);
    //return; 
  }

  public static void main(String[] args) {
    String message = "I love pop quizzes!";
    printMessage(message, 5);
  }

}
