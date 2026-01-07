package com.campusconnect;
public class Person {
    protected String name;
    protected String email;
    protected int id;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}
