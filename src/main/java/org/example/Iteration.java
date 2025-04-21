package org.example;

public class Iteration {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println(i + ". current sum:" + sum);
        }
    }
}
