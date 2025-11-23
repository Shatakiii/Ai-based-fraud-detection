package com.fraud.oop;

public abstract class BaseUser {

    protected int userId;
    protected String name;

    public BaseUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Method to demonstrate abstraction & overriding
    public abstract void showRole();

    // Encapsulation – getters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
