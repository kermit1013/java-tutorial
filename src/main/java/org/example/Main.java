package org.example;

public class Main {
    public static void main(String[] args) {
        Student kermit = new Student("kermit", 30);
        kermit.introduce();
        kermit.setSex(1);

        System.out.println(kermit.getSex());


        Student henry = new Student();
        henry.setAge(20);
        System.out.println(henry.getAge());

        BankAccount bankAccount = new BankAccount("123", 300);
        bankAccount.deposit(20.0);

        Car kermitCar = new Car("benz", 0);
        kermitCar.accSpeed(20);
        kermitCar.getSpeed();
    }
}
