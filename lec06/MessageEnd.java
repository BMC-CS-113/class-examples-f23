// Adam Poliak
// 09/21
// infitie recursion - pop quiz

public class Message {

  public static void printMessage(String str) {
    System.out.println(str);
    printMessage(str);
    //return; 
  }

  public static void main(String[] args) {
    String message = "I love pop quizzes!";
    printMessage(message);
  }

}
