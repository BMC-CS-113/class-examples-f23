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

    public static void main(String[] args) {
      Bank myBank = new Bank(10, "101 N. Merion Rd", "BMC-CS113");
      System.out.println("My bank is " + myBank.getName());
    }
}
