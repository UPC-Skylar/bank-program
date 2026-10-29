public class BankApplication {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount("ACC-001", "Jack", 5000, "ACTIVE");
        BankAccount secondAccount = new BankAccount("ACC-002", "Paul", 2000, "ACTIVE");

        firstAccount.deposit(1000);
        firstAccount.withdraw(500);

        secondAccount.deposit(300);
        secondAccount.withdraw(1000);

        BankAccount thirdAccount =
                new BankAccount(
                        "ACC-003",
                        "Ana"
                );

        System.out.println(firstAccount.balance);
        System.out.println(secondAccount.balance);
        System.out.println(thirdAccount.toString());

    }
}
