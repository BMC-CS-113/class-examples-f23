public class Arrays {

  /*
  Double the size of the input array
  and return the new array but make sure
  all original items remain in their original
  location
  */
  public static int[] expandArray(int[] array) {
    // 1. create the new array
    int[] newArray = new int[array.length * 2];
    // 2. copy elements from old to new
    for (int idx = 0; idx < array.length; idx++) {
      newArray[idx] = array[idx];
    }
    return newArray;
  }

  public static void main(String[] args) {

    int[] arr = {1,2,3,4};
    int[] newArr = expandArray(arr);

    int i = 0;
    while (i < newArr.length) {
      System.out.printf("%d: %d\n" , i, newArr[i]);
      i++;
    }

  }
}
