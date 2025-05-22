package org.example;

import net.datafaker.Faker;
import org.example.model.Course;
import org.example.model.Teacher;


public class TeacherCourse {
    public static void main(String[] args) {
        // 1. faker initialized
        Faker faker = new Faker();
        Course[] courses = {
                new Course(faker.number().positive(),
                        faker.educator().course(),
                        faker.text().text()),
                new Course(faker.number().positive(), faker.educator().course(), faker.text().text()),
                new Course(faker.number().positive(), faker.educator().course(), faker.text().text()),
        };
        Course[] newCourses = addElement(courses, new Course(faker.number().positive(),
                faker.educator().course(),
                faker.text().text()));

        Teacher teacher = new Teacher(faker.name().fullName(),
                faker.number().numberBetween(25, 30),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                newCourses,
                200.0,
                10
        );

        teacher.displayInfo();
    }

    public static Course[] addElement(Course[] array, Course elementToAdd) {
        Course[] result = new Course[array.length + 1];
        //System.arraycopy(來源, 起始索引, 目的, 起始索引, 複製長度)
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = elementToAdd;
        return result;
    }
}
