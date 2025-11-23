package com.fraud.oop;

public class User {
    private int userId;
    private String name;
    private String email;
    private String role;   // "admin" or "user"

    public User(int userId, String name, String email, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User { " +
                "ID = " + userId +
                ", Name = '" + name + '\'' +
                ", Email = '" + email + '\'' +
                ", Role = '" + role + '\'' +
                " }";
    }
}
