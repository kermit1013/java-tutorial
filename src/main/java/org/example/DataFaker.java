package org.example;

import net.datafaker.Faker;

public class DataFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();
//        String name = faker.name().fullName();
//        System.out.println(name);

        for (int i = 0; i < 10; i++) {
            String loopName = faker.name().fullName();
            System.out.println(loopName);
        }
    }
}
