package BankSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private String accountNumber;
    private Customer accountHolder;
    private double balance;
    private List<Transaction> transactionList;

    public BankAccount(String accountNumber, Customer accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }
    public void deposit(double amount){
        this.balance+=amount;
        transactionList.add(new Transaction("123123","22/10/15","deposit",amount));
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException("not enough balance");
        }
        this.balance-=amount;
        transactionList.add(new Transaction("123123","22/10/15","withdraw",amount));
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void displayInfo(){
     //   System.out.println(String.format("%s - %s - %.2f",accountNumber,accountHolder));
    }
}
