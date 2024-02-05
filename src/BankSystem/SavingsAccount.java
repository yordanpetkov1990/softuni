package BankSystem;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, Customer accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(getBalance()-amount < 100){
            throw new InsufficientFundsException("no enough balance");
        }
        super.withdraw(amount);
    }

}
