package org.example;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(sum(5)); //15
    }

    public static int factorial(int n) {
        if (n <= 1) return 1; // 終止條件
        return n * factorial(n - 1); // 遞迴調用
    }


    public static int sum(int n) {
        if (n <= 1) return 1; // 基本情況
        return n + sum(n - 1); // 遞迴調用
    }
}
