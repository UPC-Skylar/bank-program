public class BankTransactionProcessor {

    public static void main(String[] args) {
        String customerName = "Jack";
        String accountStatus = "ACTIVE";

        double initialBalance = 5000.00;
        double dailyTransferLimit = 3000.00;

        double[] transactionAmounts = {
                700.00,
                -200.00,
                1500.00,
                3500.00,
                1000.00,
                2500.00
        };

        transferAmounts(transactionAmounts, dailyTransferLimit, initialBalance, accountStatus, customerName);
    }

    public static boolean isAccountActive(String accountStatus){
        return "ACTIVE".equals(accountStatus);
    }

    public static boolean isTransferAmountValid(double transferAmount){
        return transferAmount >= 0;
    }

    public static boolean isWithinDailyLimit(double transferAmount, double dailyTransferLimit){
        return transferAmount <= dailyTransferLimit;
    }

    public static boolean hasSufficientFunds(double currentBalance, double transferAmount){
        return currentBalance >= transferAmount;
    }

    public static boolean canTransfer(double transferAmount, double dailyTransferLimit, double currentBalance, String accountStatus){
        return isTransferAmountValid(transferAmount)
                && isWithinDailyLimit(transferAmount, dailyTransferLimit)
                && hasSufficientFunds(currentBalance, transferAmount)
                && isAccountActive(accountStatus);
    }

    public static void printTransactionHeader(String customerName, double initialBalance) {
        System.out.println("=== Bank Transaction Processor ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Initial Balance: S/ " + initialBalance);
        System.out.println();
    }

    public static void printTransactionStatus(int transactionNumber, double amount, String status) {
        System.out.println("Transaction " + transactionNumber + ": " + " - S/ " + amount + ": " + status);
    }

    public static void printSummary(int approved, int rejected, double total, double currentBalance) {
        System.out.println("=== Final Summary ===");
        System.out.println("Approved Transactions: " + approved);
        System.out.println("Rejected Transactions: " + rejected);
        System.out.println("Total Transferred: S/ " + total);
        System.out.println("Current Balance: S/ " + currentBalance);
    }

    public static void transferAmounts(double[] transactionAmounts, double dailyTransferLimit, double initialBalance, String accountStatus, String customerName) {
        double currentBalance = initialBalance;
        int approvedTransactions = 0;
        int rejectedTransactions = 0;
        double totalTransferred = 0;

        printTransactionHeader(customerName, initialBalance);

        for(int i = 0; i < transactionAmounts.length; i++) {
            double transferAmount = transactionAmounts[i];

            if(canTransfer(transferAmount, dailyTransferLimit, currentBalance, accountStatus)) {
                currentBalance -= transferAmount;
                totalTransferred += transferAmount;
                approvedTransactions++;
                printTransactionStatus(i + 1, transferAmount, "Approved");
            } else {
                rejectedTransactions++;
                printTransactionStatus(i + 1, transferAmount, "Rejected");
            }
        }

        System.out.println();
        printSummary(approvedTransactions, rejectedTransactions, totalTransferred, currentBalance);
    }
}
