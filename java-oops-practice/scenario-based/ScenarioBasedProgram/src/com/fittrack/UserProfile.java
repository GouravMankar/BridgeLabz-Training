package com.fittrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;
    private int dailyTarget;
    private String goal;

    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Maintain Fitness", 2000);
    }

    public UserProfile(String name, int age, double weight, String goal, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyTarget = dailyTarget;
    }

    public double getWeight() {
        return weight;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public String getName() {
        return name;
    }
}
