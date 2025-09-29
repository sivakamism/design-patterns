package core;

public class AuthManager {
    private static User user = new User("admin", "admin123");  // default credentials
    private static boolean loggedIn = false;

    public static boolean login(String username, String password) {
        if (user.authenticate(username, password)) {
            loggedIn = true;
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }
}
