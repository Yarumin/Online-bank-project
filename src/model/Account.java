//package model;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private String creationDate;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, String creationDate, double balance) {
        this.accountNumber = accountNumber;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public List<Transaction> getTransactions() { return transactions; }

    /* @Override
    public String toString() {
        return "Account{" + "accountNumber='" + accountNumber + '\'' +", balance=" + balance +", owner=" + ownerNationalId +'}';
    } */
}
