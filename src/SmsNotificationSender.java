public class SmsNotificationSender implements NotificationSender {
    private final String providerName;

    SmsNotificationSender(String providerName) {
        if(providerName == null || providerName.isEmpty()) {
            throw new IllegalArgumentException("provider name cannot be null or empty");
        }
        this.providerName = providerName;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS via " + providerName + " to " + recipient + ": " + message);
    }
}
