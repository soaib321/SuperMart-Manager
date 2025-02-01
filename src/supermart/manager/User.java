package supermart.manager;

public class User {
    private String username;
    private String password;
    private String role; // admin, manager, cashier
    private boolean isActive; // true for active, false for deactivated

    public User(String username, String password, String role, boolean isActive) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}