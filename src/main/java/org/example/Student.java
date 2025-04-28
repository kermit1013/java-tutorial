package org.example;

public class Student {
    private String name;
    private int age;
    private Integer sex; //0 是男生(預設) 1是女生

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
        // handle 可能產生的錯誤 並返回預設值
        if (sex == null) {
            return 0;
        }
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
