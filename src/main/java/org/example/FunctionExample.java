package org.example;

import java.util.Scanner;

public class FunctionExample {
    public static void main(String[] args) {
        int ans = add(5, 10);
        System.out.println(ans);

        String greeting = greeting("kermit");
        System.out.println(greeting);

        greetingDirectly("kermitDirectly");
        int sum = add(1, 2);
        FunctionExample functionExample = new FunctionExample();
        int minusResult = functionExample.minus(10, 6);
        System.out.println(minusResult);

        System.out.println(calculate(3, 1, '/'));
        System.out.println(calculate(3, 1, 2, '-'));

        greet("kermit", 3);
//        double addResult = add(1.0, 1.2, 1.3);
//        System.out.println(addResult);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double add(double a, int b) {
        double sum = a + b;
        return sum;
    }


    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) throw new IllegalArgumentException("除數不可為0");
                return a / b;
            default:
                throw new IllegalArgumentException("無效運算符");
        }
//        return 0.0;
    }

    // 重載 calculate 3個數 相加減, 不用* , /
    public static double calculate(double a, double b, double c, char operator) {
        switch (operator) {
            case '+':
                return a + b - c;
            case '-':
                return a - b - c;
            default:
                throw new IllegalArgumentException("無效運算符");
        }

    }

    public static String greeting(String name) {
        return "你好我是" + name;
    }

    public static void greetingDirectly(String name) {
        System.out.println("你好我是" + name);
    }

    public static void greet(String name, int weekday) {
        char day;
        switch (weekday) {
            case 1:
                day = '一';
                System.out.println("你好，" + name + "！今天是星期" + day + "。");
                return;
            case 2:
                day = '二';
                System.out.println("你好，" + name + "！今天是星期" + day + "。");
                return;
            case 3:
                day = '三';
                System.out.println("你好，" + name + "！今天是星期" + day + "。");
                return;
            default:
                System.out.println("你好，" + name + "！今天是星期" + weekday + "。");
        }
    }
}
