// Adam Poliak
// 09/21
// if-else example

public class Happy {

  public static boolean isEven(int number) {
     int remainder = number % 2;
     boolean isEven = remainder == 0;
     if (isEven) {
         System.out.println("even");
     
     }
     else {
        System.out.println("odd");
     }

     return isEven;
  }

  public static void main(String[] args) {

     System.out.printf("isEven(30) returns %b should be True\n",  isEven(30)); // True
     System.out.printf("isEven(45) returns %b should be false\n",  isEven(45)); // True
     System.out.printf("isEven(27) returns %b should be false\n",  isEven(27)); // True

     boolean isHappy = true;
     boolean knowIt = true;

     if (isHappy && knowIt) {
         System.out.println("run around the room in circles");
     } 
     System.out.println("overtired toddler melt down");

  }

}
