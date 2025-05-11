package org.example.model;

public class Student extends Person implements Notifiable {
    // unique fields
    private String studentId;
    private String major;
    private String sex; //m 是男生(預設) f是女生

    public Student(String name, int age, String email, String studentId, String major, String sex) {
        super(name, age, email);
        this.studentId = studentId;
        this.major = major;
        this.sex = sex;
    }


    @Override
    public void eat() {
        System.out.println("吃營養午餐");
    }

    @Override
    public void displayInfo() {
        System.out.println("學號：" + studentId);
        System.out.println("主修：" + major);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void introduce() {
        String gender = "未定義";
        if (sex.equals("m")) {
            gender = "男生";
        } else if (sex.equals("f")) {
            gender = "女生";
        }
        System.out.println("我叫" + getName() + "，今年" + getAge() + "歲，我是" + gender);
    }

    @Override
    public void sendNotification(String message) {
        
    }
}
