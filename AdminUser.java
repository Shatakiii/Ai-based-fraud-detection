package com.fraud.oop;

public class AdminUser extends BaseUser {

    public AdminUser(int userId, String name) {
        super(userId, name);
    }

    @Override
    public void showRole() {
        System.out.println("Role: Admin User");
    }
}
