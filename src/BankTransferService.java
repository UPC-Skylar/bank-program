public class BankTransferService {

    public boolean transfer(BankAccount source, BankAccount destination, double amount){
        if(source == null || destination == null || amount < 0 || source == destination){
            System.out.println("Transfer failed: Invalid source or destination account, or amount is negative.");
            return false;
        }

        if (!source.isActive() || !destination.isActive()){
            System.out.println("Transfer failed: One or both accounts are inactive.");
            return false;
        }

        if(source.getBalance() < amount) {
            System.out.println("Transfer failed: Insufficient funds in source account.");
            return false;
        }

        source.withdraw(amount);
        destination.deposit(amount);

        System.out.println("Transferring " + amount + " from account " + source.getAccountNumber() + " to account " + destination.getAccountNumber());
        return true;
    }
}
