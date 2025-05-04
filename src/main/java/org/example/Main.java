package org.example;

public class Main {
    public static void main(String[] args) {
        Student henry = new Student();

//        henry.setSex();
        System.out.println(henry.getAge());
//        henry.setSex(1);
        System.out.println(henry.getSex());
        Circle circle = new Circle("red", 3);
        System.out.println(circle.getArea());
        BeefStewWithPotato kermitCooked = new BeefStewWithPotato(1, 555, 3, 1, 3);
        BeefStewWithPotato henryCooked = new BeefStewWithPotato(1, 0, 3, 1, 3);
        kermitCooked.serve();

    }
}
