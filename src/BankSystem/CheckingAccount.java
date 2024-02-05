package BankSystem;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, Customer accountHolder) {
        super(accountNumber, accountHolder, 0);
    }

    @Override
    public void withdraw(double amount){
        super.setBalance(getBalance()-amount);
    }
}
