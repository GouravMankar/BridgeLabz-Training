package com.edumentor;
public class User {
    protected String name, email;
    protected int userId;

    public User(int userId, String name, String email) {
        this.userId = userId; this.name = name; this.email = email;
    }
}
