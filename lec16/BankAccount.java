//Adam Poliak
// 11/02/2023
// BankAccount class

public class BankAccount {

  String name;
  double balance;
  String type; // cechking, saving, CD,  moneymarket

  //constructor
  public BankAccount() {
    name = "default";
    balance = 1.0;
    type = "checking";
  }

  //value constructor
  public BankAccount(String accName; double amount; String accountType) {
    name = accName;
    balance = amount;
    type = accountType;
  }

}
