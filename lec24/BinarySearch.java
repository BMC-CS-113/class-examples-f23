public class BinarySearch {

  public static boolean contains(int[] haystack, int needle, int low, int high) {

    int mid = (low + high) / 2;

    //base case 1: found the item 
    if (haystack[mid] == needle) {
       return true;
    }
    //base case 2: item is not found
    if (low > high) {
      return false;
    }

    if (haystack[mid] < needle) {
       // go right
       //low = mid + 1;
       return contains(haystack, needle, mid+1, high);
    }
    // go left
    return contains(haystack, needle, low, mid-1);

  }
  public static boolean containsIterative(int[] haystack, int needle) {

  }

  public static boolean contains(int[] haystack, int needle) {
    int low = 0;
    int high = haystack.length - 1;

    return contains(haystack, needle, low, high);
  }

  public static boolean linSearch(int[] haystack, int needle) {
    int count = 0;
    for (int n: haystack) {
      count++;
      if (n == needle) {
        return true;
      } 
    }
    return false;

  }

  public static void main(String[] args) {

    int[] numbs = {-2, 5, 21, 30, 64, 100, 256, 500};
    System.out.println(contains(numbs, 100));   
    //System.out.println(linSearch(numbs, 100));
    System.out.println(contains(numbs, 4));   
    //System.out.println(linSearch(numbs, 4));
    System.out.println(contains(numbs, 30));   
    //System.out.println(linSearch(numbs, 30));
    System.out.println(contains(numbs, -1));   
    //System.out.println(linSearch(numbs, -1));

  }

}
