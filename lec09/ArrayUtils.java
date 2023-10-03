// Adam Poliak
// 10/02/2023
// Array Utilities

public class ArrayUtils {

  // Ignore in the begining
  public static void add1(int[] list, int pos) {
    if (pos >= list.length) {
      return;
    }
    list[pos] += 1;
    add1(list, pos+1);
  }

  public static void add1(int[] list) {
    add1(list, 0);
  }

  public static void printList(int[] numbers, int index) {
    // base case
    if (index == numbers.length - 1) {
      System.out.printf("%d\n", numbers[index]);
      return;
    }
    // rule
    System.out.printf("%d, ", numbers[index]);
    printList(numbers, index+1);
  }

  public static void printList(int[] numbers) {
    printList(numbers, 0);

  }

  public static void foo(String blah) {
    System.out.println("I'm a string");
  }

  public static void foo(int blah) {
    System.out.println("I'm a int");
    
  }

  public static void main(String[] args) {
    foo(1);
    foo("hello");
    //String result = 1 + "1";
    //System.out.println(result);

    int[] numbs = {10, 20, 30};
    printList(numbs);
    //add1(numbs);
   
    int[] numbs2 = {10, 20, 30, 40, 50, 60, 70};
    printList(numbs2);
    //printList(numbs);
  }

}
