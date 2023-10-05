// Adam Poliak
// 10/05/2023
// Demonstrating how strings are objects

public class StrObjects {
  public static void main(String[] args) {
     String s = "hello";
     String[] strs = {s, "hi"};
     String s2 = new String("hello");
     System.out.println(strs[0] == s);
     System.out.println(strs[0] == s2);

  }

}
