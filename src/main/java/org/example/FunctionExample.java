package org.example;

public class FunctionExample {
    public static void main(String[] args) {
        int ans = add(5, 10);
        System.out.println(ans);

        String greeting = greeting("kermit");
        System.out.println(greeting);

        greetingDirectly("kermitDirectly");

        FunctionExample functionExample = new FunctionExample();
        int minusResult = functionExample.minus(10, 6);
        System.out.println(minusResult);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public static String greeting(String name) {
        return "你好我是" + name;
    }

    public static void greetingDirectly(String name) {
        System.out.println("你好我是" + name);
    }
}
