import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private LocalDateTime createdAt;
    private String ownerNationalId;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, double initialBalance, String ownerNationalId) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerNationalId = ownerNationalId;
        this.createdAt = LocalDateTime.now();
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getOwnerNationalId() { return ownerNationalId; }

    public List<Transaction> getTransactions() { return transactions; }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber='" + accountNumber + '\'' +", balance=" + balance +", owner=" + ownerNationalId +'}';
    }
}
