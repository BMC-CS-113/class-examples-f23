// Adam Poliak
// 09/13/2023
//Ask a user for their age and name,
//then print both out

import java.util.Scanner;

public class NameAge {

  public static void main(String[] args) { 
     Scanner sc = new Scanner(System.in);
     System.out.println("Give me your age and name");
     
     String name = sc.nextLine();
     int age = sc.nextInt();
  
     System.out.println(age);
     System.out.println(name);

  }

}
