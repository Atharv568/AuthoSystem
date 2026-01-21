package model;

public class User {

    private int id;
    private String name;
    private String email;
    private String passwordHash;
    private String role;

    // Empty constructor (needed later)
    public User() {}

    // Constructor for registration
    public User(String name, String email, String passwordHash, String role) {
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    // Getters (READ access)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRole() {
        return role;
    }

    // Setter only for id (DB generates it)
    public void setId(int id) {
        this.id = id;
    }
}

