//Adam Poliak
// 11/02/2023
// Bank class - added functionality 

public class Bank {

    //instance variables specify
    // the types of data stored in our
    // custom data type, aka Class
    double[] accounts;
    String[] clients;
    String address;
    String name;

    //constructor
    public Bank(int size, String location, String bankName) {
       accounts = new double[size];
       clients = new String[size];
       address = location;
       name = bankName;
    }

    public String getName() {
      return name;
    }

    //deposit money into an account
    public double deposit(int accountIdx, double amount) {
      accounts[accountIdx] += amount;
      return accounts[accountIdx];
    }

    // find out how much cash is in reserve, is in the bank
    public double totalMoney() {
      //whats the algorithm to answer this question
      double sum = 0;
      for (int i = 0; i < accounts.length; i++) {
        sum += accounts[i];
      }
      return sum;
    }

    public static double totalMoney(Bank bank) {
      return bank.totalMoney();

    }

    public static void main(String[] args) {
      int numAccounts = 10;
      Bank myBank = new Bank(numAccounts, "101 N. Merion Rd", "BMC-CS113");
      System.out.println("My bank is " + myBank.getName());
      System.out.println(myBank.totalMoney());

      int i = 0;
      while (i < 100) {
         //addd a random amount between 0, 1000 to a random account
         double amount = Math.random() * 1000;
         myBank.deposit((int) (Math.random() * (numAccounts)) , amount);
         i++;
      }

      System.out.println(myBank.totalMoney());
      System.out.println(totalMoney(myBank));
    }
}
