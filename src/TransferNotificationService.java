public class TransferNotificationService {
    private final NotificationSender sender;
    public TransferNotificationService(NotificationSender sender) {
        if(sender == null){
            throw new IllegalArgumentException("sender cannot be null");
        }
        this.sender = sender;
    }

    public void notifyTransfer(String recipient) {
        sender.send(recipient, "Transfer completed");
    }
}