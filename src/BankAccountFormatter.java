public class BankAccountFormatter {
    public static void main(String[] args) {
        String customerName = "   jack roque   ";
        String accountNumber = "191234567890";
        String accountStatus = "active";
        String email = "JACK.ROQUE@GMAIL.COM";

        int accountNumberLength = accountNumber.length();
        String lastFourDigits = accountNumber.substring(accountNumberLength - 4);

        //Crearemos variables modificadas para mayor legibilidad y facilidad a cambios a futuro
        String formattedCustomerName = customerName.trim().toUpperCase();
        //Aqui pude usar un for pero investigue el metodo repeat en Java y lo implemente
        String accountNumberWithSecurityAsterisks = "*".repeat(accountNumberLength - 4) + lastFourDigits;
        String accountStatusInUpperCase = accountStatus.toUpperCase();
        String normalizedEmail = email.toLowerCase();
        boolean hasGmailDomain = normalizedEmail.endsWith("@gmail.com");

        System.out.println("=== Account Information ===");
        System.out.println("Customer: " + formattedCustomerName);
        System.out.println("Account: " + accountNumberWithSecurityAsterisks);
        System.out.println("Status: " + accountStatusInUpperCase);
        System.out.println("Email: " + normalizedEmail);
        System.out.println("Valid Gmail: " + hasGmailDomain);
    }
}
