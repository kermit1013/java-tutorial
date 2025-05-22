package org.example;

import net.datafaker.Faker;

public class ExceptionDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            int numerator = 10;
            int denominator = faker.random().nextInt(2);
            System.out.println("分母為：:" + denominator);
            int result;
            try {
                result = divide(1, 0);
            } catch (ArithmeticException e) {
                result = 0; // result預設值為0
//                System.out.println("除數不得為零");
            }
            System.out.println("計算結果為：:" + result);
        }
        System.out.println("程式繼續執行");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result;
        if (b == 0) {
            throw new ArithmeticException();
        }
        result = a / b;
        return result;
    }

    public static int divideWithTry(int a, int b) throws ArithmeticException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw e;
        }
        return result;
    }

}
