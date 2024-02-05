package BankSystem;

public class Main {
    public static void main(String[] args) {
        Customer georgi = new Customer("1","GEORGI");
        Customer yordan = new Customer("2","YORDAN");
        Customer viktor = new Customer("3","VIKTOR");

        yordan.addBankAccount(new SavingsAccount("101010",yordan,100));
        yordan.getBankAccountList().get(0).deposit(100);
        System.out.println();
    }
}
