package core;

public class Notifier {
    public static void notifyUser(int roomId, String message) {
        // In real project: integrate Email/SMS APIs
        // Here: just simulate with console output
        System.out.println("[NOTIFICATION] Room " + roomId + ": " + message);
    }
}
