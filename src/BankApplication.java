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

        BankAccount cus001SavingsAccount = new SavingsAccount(
                "ACC-001",
                firstCustomer,
                1500,
                0.3
        );

        BankAccount cus001CheckingAccount = new CheckingAccount(
                "ACC-002",
                firstCustomer,
                3000,
                "ACTIVE"
        );

        BankAccount cus002SavingsAccount = new SavingsAccount(
                "ACC-003",
                secondCustomer,
                800,
                0.09
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

        InterestBearing annualInterest = new SavingsAccount("ACC-005",
                secondCustomer,
                4000,
                0.06);

        System.out.println(annualInterest.calculateAnnualInterest());
    }
}
