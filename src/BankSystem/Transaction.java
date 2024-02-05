package BankSystem;

public class Transaction {
    private String transactionId;
    private String date;
    private String type;
    private double amount;

    public Transaction(String transactionId, String date, String type, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
    }
}
