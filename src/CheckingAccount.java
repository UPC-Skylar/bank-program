public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, Customer owner, double balance, String status) {
        super(accountNumber, owner, balance, status);
    }

    public CheckingAccount(String accountNumber, Customer owner) {
        super(accountNumber, owner);
    }

    @Override
    public String getAccountType() {
        return "CHECKING";
    }



}
