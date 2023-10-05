// Adam Poliak
// 10/05/2023
// Compute the range between two numbers

public class Range {

  public static void main(String[] args) {

     // get a random number between 0 an 200
     //System.out.println(Math.random() * 200);
     String minStr = args[0];
     String maxStr = args[1];

     int max = Integer.parseInt(maxStr);
     int min = Integer.parseInt(minStr);
     int range = max - min;
     double randDouble = Math.random();
     System.out.println(randDouble);
     //System.out.println(Math.round(randDouble * range) + min);
     // be careful when casting to an integer. we loose information
     int randInt = (int) (randDouble * range);
     System.out.println(randInt+ min);


  }
}

