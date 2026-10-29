public class BankAccount {
    private final String accountNumber; //fields
    private final Customer owner;
    private double balance;
    private String status;
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, Customer owner, double balance, String status) {
        if(accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if(owner.getFullName() == null || owner.getFullName().isBlank()) {
            throw new IllegalArgumentException("Invalid customer name");
        }

        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        if(!"ACTIVE".equalsIgnoreCase(status) && !"BLOCKED".equalsIgnoreCase(status)) {
            throw new IllegalArgumentException("Invalid status");
        }

        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.status = status.toUpperCase();
        totalAccounts++;
    }

    public BankAccount(String accountNumber, Customer owner){
        this(accountNumber, owner, 0, "ACTIVE");
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
        return owner.getFullName();
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
                ", owner='" + owner.getFullName() + '\'' +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                '}';
    }
}
