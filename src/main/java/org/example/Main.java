package org.example;

import org.example.model.BankAccount;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {

////        henry.setSex();
//        System.out.println(henry.getAge());
////        henry.setSex(1);
//        System.out.println(henry.getSex());
//        Circle circle = new Circle("red", 3);
//        System.out.println(circle.getArea());
//
//        BeefStewWithPotato kermitCooked = new BeefStewWithPotato(1, 555, 3, 1, 3);
//        BeefStewWithPotato henryCooked = new BeefStewWithPotato(1, 0, 3, 1, 3);
//        kermitCooked.serve();
//        String result = kermitCooked.serve("Kermit");
//        System.out.println(result);


        BankAccount bankAccount = new BankAccount("123", 0.0);
        bankAccount.deposit(100);
        bankAccount.withdraw(20);
        bankAccount.checkBalance();
    }
}
