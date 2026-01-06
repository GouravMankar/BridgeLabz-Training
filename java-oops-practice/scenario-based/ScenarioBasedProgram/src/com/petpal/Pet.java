package com.petpal;

public abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private String mood;

    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    public void feed() {
        hunger -= 10;
        if (hunger < 0) hunger = 0;
        updateMood();
        System.out.println(name + " has been fed.");
    }

    public void play() {
        energy -= 10;
        hunger += 5;
        updateMood();
        System.out.println(name + " played happily.");
    }

    public void sleep() {
        energy += 15;
        updateMood();
        System.out.println(name + " is sleeping...");
    }

    protected void updateMood() {
        if (energy > 70 && hunger < 30) mood = "Happy";
        else if (hunger > 60) mood = "Hungry";
        else if (energy < 30) mood = "Tired";
        else mood = "Normal";
    }

    public void showStatus() {
        System.out.println("Name: " + name + ", Type: " + type + ", Age: " + age);
        System.out.println("Hunger: " + hunger + ", Energy: " + energy + ", Mood: " + mood);
    }

    public abstract void makeSound();
}
