// Adam Poliak/
// 10/26/2023
// More practice with Loops & 2D arrays


public class Loops {

  public static int sumDiag(int[][] table) {
    int sum = 0;
    for (int x = 0; x < table.length; x++) {
       sum += table[x][x];
    }
    return sum;
  }

  // print out a square of stars
  // the dimension should be size x size
  public static void printSquare(int size) {

    for (int j = 0; j < size ; j+= 1) {
      for (int i = size; i > 0 ; i -= 1) {
        System.out.print("*");
      }
      System.out.println();
    }
    // this next line will cause a compiler error
    // bc j is out-of-scope
    // if you dont believe us, uncomment it and see for yourself
    //System.out.println(j);

  }

  public static void print(int[][] table) {

    for (int row = 0; row < table.length; row += 1) {
      for (int col = 0; col < table[row].length ; col += 1) {
         System.out.print(table[row][col]);
      }
      System.out.println();
    }

  }

  public static void printArray(int[] arr) {

     //loop:
       // repeating some code/computation/some order of operatins
       // print out the value at the current index
    // initialize, continue condition, increment
    // condition: once we are at the end of the array
    for (int idx = 0; idx < arr.length; idx += 1) {
       System.out.print(arr[idx]);
       System.out.println();
    }
    System.out.println("----");
  }

  public static void main(String[] args) {
     int[] array1 = {1,2,3,4};
     int[] array4 = {1,2,3,4};
     int[] array3 = {1,2,3,4};
     int[] array2 = {1,2,3,4};
     /*
     printArray(array1);

     int[] array2 = {1,2,3,4,5,6,7,8,9,10};
     printArray(array2);
     */
     printSquare(5);
     //int[][] table = new int[5][2];
     //table[3] = array1;
     //print(table);

     int[][] table = new int[4][4];
     table[0] = array1;
     table[1] = array2;
     table[2] = array3;
     table[3] = array4;
     System.out.println(sumDiag(table));
  }

}
