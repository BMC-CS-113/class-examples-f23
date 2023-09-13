// Adam Poliak
// 09/13/2023
// Convert Miles to KM using console().readLine()

public class Miles2KM {

  public static void main(String[] args) {

      // Come up with algorith
      // ask user for input, i.e. how many miles
      System.out.println("give me some miles, please");
      // keep track of user's input, store the input
      String userInput = System.console().readLine();
      System.out.println(userInput);

       // convert usersInput to a double
       double miles = Double.parseDouble(userInput);

      // convert that value into KMs
      double kms = 1.6 * miles; 

      //print out the value
      System.out.println(kms);
  }
  

}
