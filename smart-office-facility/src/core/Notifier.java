package core;

public class Notifier {
    public static void notifyUser(int roomId, String message) {
        System.out.println("[NOTIFICATION] Room " + roomId + ": " + message);
    }
}
