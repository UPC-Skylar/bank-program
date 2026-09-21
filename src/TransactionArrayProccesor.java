public class TransactionArrayProccesor {
    public static void main(String[] args) {
        double initialBalance = 5000.00;

        double[] transactionAmounts = {
                700.00,
                1200.00,
                2500.00,
                800.00,
                300.00,
                1000.00
        };

        double currentBalance = initialBalance;

        int approvedTransactions = 0;
        int rejectedTransactions = 0;

        double totalTransferred = 0;

        for(int i = 0; i < transactionAmounts.length; i++) {
            double transferAmount = transactionAmounts[i];
            if(canTransfer(currentBalance, transferAmount)) {
                currentBalance -= transferAmount;
                totalTransferred += transferAmount;
                approvedTransactions++;
                printTransactionStatus(i + 1, transferAmount, "Approved");
            } else {
                rejectedTransactions++;
                printTransactionStatus(i + 1, transferAmount, "Rejected - Insufficient Funds");
            }
        }
        printSummary(approvedTransactions, rejectedTransactions, totalTransferred, currentBalance);
    }

    public static boolean canTransfer(double currentBalance, double transferAmount) {
        return currentBalance >= transferAmount;
    }

    public static void printTransactionStatus(int transactionNumber, double amount, String status) {
        System.out.println("Transaction " + transactionNumber + ": " + " - S/ " + amount + ": " + status);
    }

    public static void printSummary(int approvedTransactions, int rejectedTransactions, double totalTransferred, double finalBalance) {
        System.out.println("=== Transaction Summary ===");
        System.out.println("Approved Transactions: " + approvedTransactions);
        System.out.println("Rejected Transactions: " + rejectedTransactions);
        System.out.println("Total Transferred: S/ " + totalTransferred);
        System.out.println("Final Balance: S/ " + finalBalance);
    }
}
