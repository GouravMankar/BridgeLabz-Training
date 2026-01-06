package com.petpal;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, "Cat", age, 35, 65);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
