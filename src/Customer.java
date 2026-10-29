public class Customer {
    private final String customerId;
    private final String fullName;
    private String email;

    public Customer(String customerId, String fullName, String email) {

        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Invalid customer name");
        }

        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
