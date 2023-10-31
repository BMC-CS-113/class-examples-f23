public class Bank {

   int size;
   String name;
   String[] clients;
   double[] accounts;

   public Bank(String bankName, int numClients) {
     name = bankName;
     size = numClients;
     clients = new String[size];
     accounts = new double[size];
   }

   public String getName() {
     return name;
   }
}
