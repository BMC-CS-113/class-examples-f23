// Adam Poliak
// 09/26/2023
// String Comparison

public class StringComp {

  public static void main(String[] args) {

    String one = "one";
    String two = "one";
    System.out.printf("one == two: %b\n", one == two);

    String three = new String("one");
    System.out.printf("three == two: %b\n", three == two);

    String four = "on";
    System.out.printf("one == four+\"e\": %b\n", one == four + "e");

    /*
    System.out.println("Using compareTo");
    System.out.printf("one.compareTo(two): %d\n", one.compareTo(two));
    System.out.printf("three.compareTo(two): %d\n", three.compareTo(two));
    System.out.printf("one.compareTo(four+\"e\"): %d\n", one.compareTo(four + "e"));
    */
  }

}
