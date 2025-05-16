package org.example;

import net.datafaker.Faker;
import org.example.model.Course;
import org.example.model.RetiredTeacher;
import org.example.model.Student;
import org.example.model.Teacher;

public class InheritDemo {
    public static void main(String[] args) {
        // 1. faker initialized
        Faker faker = new Faker();
        // 2. Teacher initialized
        Teacher teacher = new Teacher(faker.name().fullName(),
                faker.number().numberBetween(25, 30),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.number().positive(),
                                faker.educator().course(),
                                faker.text().text()),
                        new Course(faker.number().positive(), faker.educator().course(), faker.text().text()),
                        new Course(faker.number().positive(), faker.educator().course(), faker.text().text()),
                },
                200.0,
                10
        );
        // 3. Student initialized
        Student student = new Student(
                faker.name().fullName(),
                faker.number().numberBetween(18, 22),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().course(),
                faker.gender().shortBinaryTypes()
        );
        // 4. teacher invoke(call) functions
        teacher.teach();
        teacher.displayInfo();
        teacher.eat();
        // 5. student invoke(call) functions
        student.displayInfo();
        student.eat();
        // 6. retiredTeacher initialized
        RetiredTeacher retiredTeacher = new RetiredTeacher(faker.name().fullName(),
                faker.number().numberBetween(25, 30),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.idNumber().hashCode(), faker.educator().course(), "Default description"),
                        new Course(faker.idNumber().hashCode(), faker.educator().course(), "Default description"),
                        new Course(faker.idNumber().hashCode(), faker.educator().course(), "Default description"),
                },
                faker.bool().bool()
        );
        // 7. 打印 retiredTeacher的 isRetired 屬性
        System.out.println("該位老師是否退休：" + retiredTeacher.isRetired());
        // 8. teacher invoke(call) functions
        teacher.processPayment();
        // 9. 打印 teacher的 getPaymentDetail方法
        System.out.println(teacher.getPaymentDetail());
        teacher.sendNotification("測試訊息");

    }
}
