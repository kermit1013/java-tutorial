package org.example;

import org.example.model.Dog;

public class Extends {
    public static void main(String[] args) {
        Dog dog = new Dog("mammals");
        dog.eat();
        System.out.println(dog.getSpecies());
    }
}
