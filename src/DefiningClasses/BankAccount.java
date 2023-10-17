package DefiningClasses;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int idCounter = 1;
    private int id;
    private double balance;
    public BankAccount(){
        this.id = idCounter++;
        this.balance = 0;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
    public double getInterest(int years){
        return years * interestRate * balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }
}
