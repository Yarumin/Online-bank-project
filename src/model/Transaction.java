//package model;

/* import java.time.LocalDateTime;
import java.util.UUID; */

public class Transaction {
    private String transactionId;
    private String sourceAccount;
    private String destinationAccount;
    private String date;
    private double amount;

    public Transaction(String transactionId, String sourceAccount, String destinationAccount, String date, double amount) {
        this.transactionId = transactionId;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.date = date;
        this.amount = amount;
    }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getSourceAccount() { return sourceAccount; }
    public void setSourceAccount(String sourceAccount) { this.sourceAccount = sourceAccount; }

    public String getDestinationAccount() { return destinationAccount; }
    public void setDestinationAccount(String destinationAccount) { this.destinationAccount = destinationAccount; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    /* @Override
    public String toString() {
        return "[" + timestamp + "] " + " amount=" + amount + " from=" + fromAccount + " to=" + toAccount;
    } */
}

