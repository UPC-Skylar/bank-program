public class SmsNotificationSender implements NotificationSender {
    private final String providerName;

    public SmsNotificationSender(String providerName) {
        if(providerName == null || providerName.isBlank()) {
            throw new IllegalArgumentException("provider name cannot be null or empty");
        }
        this.providerName = providerName;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS via " + providerName + " to " + recipient + ": " + message);
    }
}
