// Adam Poliak
// 10/05/2023
// Demonstrate how to use command line args

public class CmdArgs {

  public static void main(String[] args) {

     //lets ensure the user puts in one arg, and stop the programming
     //if they dont

     if (args.length != 1) {
         System.out.println("CmdArgs requires 1 argument");
         return;
     }
     System.out.println(args[0] + 100);

     System.out.println(args[0]);
     //System.out.println(args[1]);
     //System.out.println(args[2]);
  }

}
