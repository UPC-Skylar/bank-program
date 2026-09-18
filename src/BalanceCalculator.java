public class BalanceCalculator {
    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static double withdraw(double balance, double amount) {
        //Por ahora no validamos reglas, solo calculos
        return balance - amount;
    }

    public static void main(String[] args) {
        double balance = 1000;

        balance = deposit(balance, 500);
        balance = withdraw(balance, 300);

        System.out.println(balance);
    }
}
