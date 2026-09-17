public class TransactionBatchProcessor {
    public static void main(String[] args) {
        double initialBalance = 3000.00;
        double transactionAmount = 700.00;
        int numberOfTransactions = 6;

        //Inicializamos con el saldo inicial
        double currentBalance = initialBalance;
        int approvedTransactions = 0;
        int rejectedTransactions = 0;
        double totalTransferred = 0.0;

        System.out.println("=== Transaction Processing ===");

        for(int i = 1; i <= numberOfTransactions; i++) {
            if(currentBalance >= transactionAmount){
                currentBalance -= transactionAmount;
                approvedTransactions++;
                totalTransferred += transactionAmount;
                System.out.println("Transaction " + i + ": " + "APPROVED");
            } else {
                rejectedTransactions++;
                System.out.println("Transaction " + i + ": " + "REJECTED");
            }
        }

        System.out.println();
        System.out.println("=== Summary ===");
        System.out.println("Initial Balance: S/ " + initialBalance);
        System.out.println("Final Balance: S/ " + currentBalance);
        System.out.println("Approved Transactions: " + approvedTransactions);
        System.out.println("Rejected Transactions: " + rejectedTransactions);
        System.out.println("Total Transferred: S/ " + totalTransferred);

    }


}
