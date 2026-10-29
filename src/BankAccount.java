public class BankAccount {
    String accountNumber; //fields
    String customerName;
    double balance;
    String status;

    public BankAccount(String accountNumber, String customerName, double balance, String status) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.status = status;
    }

    public BankAccount(String accountNumber, String customerName){
        this(accountNumber, customerName, 0, "ACTIVE");
    }



    public void deposit(double amount) { //method
        if(amount > 0) balance += amount;
    }

    public boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && hasSufficientFunds(amount)) balance -= amount;
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
