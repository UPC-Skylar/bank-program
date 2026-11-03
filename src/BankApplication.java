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

        InterestBearing annualInterest = new SavingsAccount("ACC-005",
                secondCustomer,
                4000,
                0.06);

        NotificationSender firstSender = new EmailNotificationSender();
        NotificationSender secondSender = new SmsNotificationSender();

        //Aqui usamos un sender de tipo email
        TransferNotificationService service = new TransferNotificationService(firstSender);
        service.notifyTransfer("ana@gmail.com");
        service = new TransferNotificationService(secondSender);
        service.notifyTransfer("947337122");
    }
}
