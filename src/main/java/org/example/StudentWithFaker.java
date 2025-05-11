package org.example;

import net.datafaker.Faker;
import org.example.model.Student;

public class StudentWithFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String gender = faker.gender().shortBinaryTypes();
        System.out.println(gender);
    }
}
