public class BankTransferService {

    public static void main(String[] args) {
        String accountStatus = "ACTIVE";

        double balance = 3500.00;
        double transferAmount = 1200.00;
        double dailyTransferLimit = 5000.00;

        boolean isActive = isAccountActive(accountStatus);
        boolean isAmountValid = isTransferAmountValid(transferAmount);
        boolean hasFunds = hasSufficientFunds(balance, transferAmount);
        boolean isWhitinLimit = isWithinDailyLimit(transferAmount, dailyTransferLimit);
        boolean isApproved = isTransferApproved(isActive, isAmountValid, hasFunds, isWhitinLimit);

        printHeader();
        System.out.println("Account Status: " + accountStatus);
        System.out.println("Is Active: " + isActive);
        System.out.println("Is Transfer Amount Valid: " + isAmountValid);
        System.out.println("Has Sufficient funds: " + hasFunds);
        System.out.println("Is Within Daily Limit: " + isWhitinLimit);
        System.out.println("Is Transfer Approved: " + isApproved);
    }

    public static void printHeader() {
        System.out.println("=== Transfer Summary ===");
    }

    public static boolean isAccountActive(String accountStatus) {
        return "ACTIVE".equals(accountStatus);
    }

    public static boolean isTransferAmountValid(double transferAmount){
        return transferAmount > 0;
    }

    public static boolean hasSufficientFunds(double balance, double transferAmount) {
        return balance >= transferAmount;
    }

    public static boolean isWithinDailyLimit(double transferAmount, double dailyTransferLimit) {
        return transferAmount <= dailyTransferLimit;
    }

    public static boolean isTransferApproved(boolean isAccountActive, boolean isAmountValid, boolean hasSufficientFunds, boolean isWithinDailyLimit) {
        return isAccountActive && isAmountValid && hasSufficientFunds && isWithinDailyLimit;
    }

}
