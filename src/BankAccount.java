public class BankAccount {
    private final String accountNumber; //fields
    private final String customerName;
    private double balance;
    private String status;
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String customerName, double balance, String status) {
        if(accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if(customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("Invalid customer name");
        }

        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        if(!"ACTIVE".equalsIgnoreCase(status) && !"BLOCKED".equalsIgnoreCase(status)) {
            throw new IllegalArgumentException("Invalid status");
        }

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.status = status.toUpperCase();
        totalAccounts++;
    }

    public BankAccount(String accountNumber, String customerName){
        this(accountNumber, customerName, 0, "ACTIVE");
    }

    public void deposit(double amount) { //method
        if(amount > 0 && isActive()) balance += amount;
    }

    public boolean hasSufficientFunds(double amount) {
        return amount > 0 && balance >= amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && hasSufficientFunds(amount) && isActive()) balance -= amount;
    }

    public boolean isActive() {
        return "ACTIVE".equalsIgnoreCase(status);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void block(){
        status = "BLOCKED";
    }

    public void activate(){
        status = "ACTIVE";
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                '}';
    }
}
