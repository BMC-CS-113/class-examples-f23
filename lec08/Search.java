// Adam Poliak
// 09/28/2023
// Recursion:  search for char in string
// access characters in strings

public class Search {

  /**
   add javdoc here
  */
  public static boolean containsLetter(String haystack, char needle) {
     // come up with algorithm
     // check if the character matcfhes the first character in the String
     // if yes:
	// return true
     if (haystack.length() == 0) {
       return false;
     }

     if (haystack.charAt(0) == needle) {
       return true;
     }
     // if no: punt the rest of the problem down
     return containsLetter(haystack.substring(1), needle);
  }

  /** 	
	Implement a method called charStats that prints out 
	the character in the first index of the string,
	the character at the middle location of the string
	the character at the last index of the string
  */
   public static void charStats(String str) {
	char first = str.charAt(0);
        System.out.printf("First character is %c\n", first);
	char last = str.charAt(str.length()-1);
        System.out.printf("Last character is %c\n", last);
	char middle = str.charAt(str.length()/2);
        System.out.printf("Middle character is %c\n", middle);

   }

  public static void main(String[] args) {
     System.out.println(containsLetter("hello", 'a')); // false
     System.out.println(containsLetter("hello", 'e')) ;// true
     System.out.println(containsLetter("", 'e')); // false

     charStats("I love food & java!");
  }

}
