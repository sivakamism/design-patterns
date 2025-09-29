public class FactoryDemo {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("email");
        Notification n2 = NotificationFactory.createNotification("sms");
        Notification n3 = NotificationFactory.createNotification("push");

        n1.notifyUser();
        n2.notifyUser();
        n3.notifyUser();
    }
}
