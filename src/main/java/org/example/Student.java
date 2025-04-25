package org.example;

public class Student {
    private String name;
    private int age;
    private int sex; // 1：male 2:female

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {

    }

    public void introduce() {
        System.out.println("我叫" + name + "，今年" + age + "歲");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
