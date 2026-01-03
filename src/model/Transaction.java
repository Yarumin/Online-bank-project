package model;

/* import java.time.LocalDateTime;
import java.util.UUID; */

public class Transaction {

    private String sourceAccount;
    private String destinationAccount;
    private double amount;
    private String date;
    private String reportId;

    public Transaction(String sourceAccount, String destinationAccount, double amount, String date, String reportId) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.date = date;
        this.reportId = reportId;
    }

    public String getSourceAccount() { return sourceAccount; }
    public void setSourceAccount(String sourceAccount) { this.sourceAccount = sourceAccount; }

    public String getDestinationAccount() { return destinationAccount; }
    public void setDestinationAccount(String destinationAccount) { this.destinationAccount = destinationAccount; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getReportId() { return reportId; }
    public void setReportId(String reportId) { this.reportId = reportId; }

    @Override
    public String toString() {
        return "Transaction | From: " + sourceAccount +
               " To: " + destinationAccount +
               " | Amount: " + amount +
               " | Date: " + date +
               " | ReportID: " + reportId;
    }
}
