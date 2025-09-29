package core;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }
}
