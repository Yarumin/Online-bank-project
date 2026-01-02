import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String customerType;
    private List<Account> accounts = new ArrayList<>();
    private List<Transaction> transactionsHistory = new ArrayList<>();

    public Customer(String firstName, String lastName, String nationalId,
                    String phoneNumber, String email, String address,
                    String postalCode, String password, String customerType) {
        super(firstName, lastName, nationalId, phoneNumber, email, address, postalCode, password);
        this.customerType = customerType;
    }

    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public List<Account> getAccounts() { return accounts; }

    public void addTransaction(Transaction t) {
        transactionsHistory.add(t);
    }

    public List<Transaction> getTransactionsHistory() { return transactionsHistory; }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + ", type=" + customerType + ", accounts=" + accounts.size() + "}";
    }
}
