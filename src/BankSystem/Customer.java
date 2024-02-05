package BankSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<BankAccount> bankAccountList;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.bankAccountList = new ArrayList<>();
    }
    public void addBankAccount(BankAccount bankAccount){
        this.bankAccountList.add(bankAccount);
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}
