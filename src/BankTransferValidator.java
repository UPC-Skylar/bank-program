public class BankTransferValidator {
    public static void main(String[] args) {
        String customerName = "Jack";
        String accountStatus = "ACTIVE";

        double balance = 3500.00;
        double transferAmount = 1200.00;
        double dailyTransferLimit = 5000.00;

        boolean isAccountActive = "ACTIVE".equals(accountStatus);
        boolean isTransferAmountValid = transferAmount > 0;
        boolean hasSufficientFunds = balance >= transferAmount;
        boolean isWithinDailyLimit = transferAmount <= dailyTransferLimit;

        boolean isTransferApproved = (isAccountActive && isTransferAmountValid && hasSufficientFunds && isWithinDailyLimit);

        System.out.println("=== Transfer Validation ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Transfer Amount: S/ " + transferAmount);
        System.out.println("Account active: " + isAccountActive);
        System.out.println("Amount valid: " + isTransferAmountValid);
        System.out.println("Sufficient Funds: " + hasSufficientFunds);
        System.out.println("Within daily limit: " + isWithinDailyLimit);
        System.out.println("Transfer Approved: " + isTransferApproved);
    }
}
