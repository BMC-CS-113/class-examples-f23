// Adam Poliak
// 10/03/2023
// Recursion: printVowles in string, validate user input

//Write a recursive method called printVowels 
//that prints just the vowels in a string
import java.util.Scanner;

public class PrintVowels {

  public static void printVowels(String str) {


     //base case
     if (str.length() == 0) {
       System.out.println();
       return;
     }
     // rule
     // check if a character is a vowel
     char lastChar = str.charAt(0); //str.length() - 1);
     switch (lastChar) {
        case 'a':
        case 'A':
        case 'E':
        case 'e':
        case 'I':
        case 'i':
        case 'O':
        case 'o':
        case 'U':
        case 'u':
          System.out.printf("%c", lastChar);
     }
     printVowels(str.substring(1));

  }

  public static String getUserName() {
     System.out.println("Give us your first and last name");
     Scanner sc = new Scanner(System.in);
     String name = sc.nextLine();

     //checks if user input is good
     if (!name.contains(" ") || name.indexOf(" ") == 0 || name.indexOf(" ") == name.length() - 1) {
       System.out.println("bad name, try again");
       name = getUserName();
     }
     return name;

  }

  public static void main(String[] args) {
    printVowels("hello"); // should print "eo"
    printVowels("reCursivE"); // should print euiE"

    System.out.println(getUserName());

  }

}
