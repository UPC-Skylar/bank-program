public class AuthenticationAttempts {
    public static void main(String[] args) {
        String correctPin = "1234";
        String enteredPin = "0000";
        boolean correct = false;

        int attempts = 0;
        int maxAttempts = 3;

        while(attempts < maxAttempts) {
            if(correctPin.equals(enteredPin)){
                System.out.println("Correct PIN! You're Welcome :D");
                correct = true;
                attempts++;
                break;
            }

            System.out.println("Authentication failed. Attempt " + (attempts + 1));
            attempts++;
        }

        if(!correct) System.out.println("Account temporarily blocked.");
    }
}
