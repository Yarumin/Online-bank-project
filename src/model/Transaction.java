import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private String id;
    private TransactionType type;
    private double amount;
    private LocalDateTime timestamp;
    private String fromAccount;
    private String toAccount;

    public Transaction(TransactionType type, double amount, String fromAccount, String toAccount) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public String getId() { return id; }
    public TransactionType getType() { return type; }
    public double getAmount() { return amount; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getFromAccount() { return fromAccount; }
    public String getToAccount() { return toAccount; }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + type + " amount=" + amount + " from=" + fromAccount + " to=" + toAccount;
    }
}

