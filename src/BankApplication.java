public class BankApplication {
    public static void main(String[] args) {
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
        BankAccount firstAccount = new BankAccount("ACC-001", "Jack", 1000, "ACTIVE");
        BankAccount secondAccount = new BankAccount("ACC-002", "Paul", 2500, "ACTIVE");

        //firstAccount.deposit(1000);
        //firstAccount.withdraw(500);

        //secondAccount.deposit(300);
        //secondAccount.withdraw(1000);

        BankAccount thirdAccount = new BankAccount(
                        "ACC-003",
                        "Ana", 500, "ACTIVE");

        System.out.println(firstAccount);
        System.out.println(secondAccount);
        System.out.println(thirdAccount);
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
