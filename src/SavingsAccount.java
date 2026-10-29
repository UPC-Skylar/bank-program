public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, Customer owner, double balance, double interestRate) {
        super(accountNumber, owner, balance, "ACTIVE");

        if (interestRate < 0.0 || interestRate > 1.0) {
            throw new IllegalArgumentException("Interest rate must be between 0 and 1");
        }

        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, Customer owner, double interestRate) {
        this(accountNumber, owner, 0, interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String getAccountType() {
        return "SAVINGS";
    }


}
