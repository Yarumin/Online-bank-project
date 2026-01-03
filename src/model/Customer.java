//package model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private String type;
    private List<Account> accounts = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public Customer(String firstName,
                    String lastName,
                    String nationalId,
                    String phoneNumber,
                    String address,
                    String email,
                    String postalCode,
                    String password,
                    String type) {
        super(firstName, lastName, nationalId, phoneNumber, address, email, postalCode, password);
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public List<Account> getAccounts() { return accounts; }
    public List<Transaction> getTransactions() { return transactions; }

    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    @Override
    public String toString() {
        return "Customer | " + super.toString() + " | Type: " + type + " | Accounts Count: " + accounts.size();
    }
}
