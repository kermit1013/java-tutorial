package org.example;

import net.datafaker.Faker;

import static java.util.Locale.CHINESE;

public class Main {
    public static void main(String[] args) {
        Student henry = new Student();
//        henry.setSex();
        System.out.println(henry.getAge());
//        henry.setSex(1);
        System.out.println(henry.getSex());
        Circle circle = new Circle("red", 3);
        System.out.println(circle.getArea());
        Faker faker = new Faker();
        System.out.println(faker.address().country());

    }
}
