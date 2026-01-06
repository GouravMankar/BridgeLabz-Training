package com.petpal;

public class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, "Bird", age, 30, 70);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}
