public class BankApplication {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(
                "CUS-001",
                "Ana",
                "ana@gmail.com"
        );

        Customer secondCustomer = new Customer(
                "CUS-002",
                "Luis",
                "luis@gmail.com"
        );

        BankAccount cus001SavingsAccount = new BankAccount(
                "ACC-001",
                firstCustomer,
                1500,
                "ACTIVE"
        );

        BankAccount cus001CheckingAccount = new BankAccount(
                "ACC-002",
                firstCustomer,
                3000,
                "ACTIVE"
        );

        BankAccount cus002SavingsAccount = new BankAccount(
                "ACC-003",
                secondCustomer,
                800,
                "ACTIVE"
        );

        SavingsAccount savingsAccount = new SavingsAccount(
                "ACC-004",
                firstCustomer,
                2000,
                0.03
        );

        System.out.println("\nCustomers:");
        System.out.println("Customer 1: " + firstCustomer.getFullName());
        System.out.println("Customer 2: " + secondCustomer.getFullName());

        System.out.println("\nBank Accounts:");
        System.out.println("cus001SavingsAccount: " + cus001SavingsAccount);
        System.out.println("cus001CheckingAccount: " + cus001CheckingAccount);
        System.out.println("cus002SavingsAccount: " + cus002SavingsAccount);

        savingsAccount.deposit(500);

        System.out.println(savingsAccount.getBalance());
        System.out.println(savingsAccount.getAccountType());
        System.out.println(savingsAccount.getInterestRate());

        System.out.println("\nTotal accounts: " + BankAccount.getTotalAccounts());

    }
}
