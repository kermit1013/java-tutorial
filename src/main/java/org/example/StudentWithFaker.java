package org.example;

import net.datafaker.Faker;
import org.example.model.Student;

public class StudentWithFaker {
    public static void main(String[] args) {
        // faker init
        Faker faker = new Faker();
        // declare gender
        String gender = faker.gender().shortBinaryTypes();
        // print out gender
        System.out.println(gender);
    }
}
