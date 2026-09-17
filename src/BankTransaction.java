public class BankTransaction {
    public static void main(String[] args) {
        String customerName = "Jack";
        boolean accountStatus = true;
        double initialBalance = 2500.50, depositAmount = 500.00, withdrawalAmount = 350.25;

        double finalBalance = initialBalance + depositAmount - withdrawalAmount;

        System.out.println("=== Transaction Summary ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Account active: " + accountStatus);
        System.out.println("Initial balance: S/ " + initialBalance);
        System.out.println("Deposit: S/ " + depositAmount);
        System.out.println("Withdrawal: S/ " + withdrawalAmount);
        System.out.println("Final balance: S/ " + finalBalance);
    }
}
