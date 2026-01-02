import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private String id;
    private double amount;
    private LocalDateTime timestamp;
    private String fromAccount;
    private String toAccount;

    public Transaction( double amount, String fromAccount, String toAccount) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getFromAccount() { return fromAccount; }
    public String getToAccount() { return toAccount; }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + " amount=" + amount + " from=" + fromAccount + " to=" + toAccount;
    }
}

