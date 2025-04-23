package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 提示：
        // 1. 用Random產生1-100隨機數
        // 2. 使用do-while迴圈持續猜測
        // 3. 比較輸入數字與答案，給予提示
        // 4. 只能猜5次
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = 0;
        final int MAX_ATTEMPTS = 5;


        System.out.println("GuessNumber: Game started!!!");


//        do {
//            System.out.println("Your guess is:");
//            guess = scanner.nextInt();
//            attempts++;
//            if (guess < secret) {
//                System.out.println("太小");
//            } else if (guess > secret) {
//                System.out.println("太大");
//            }
//            System.out.println("剩餘次數:" + (MAX_ATTEMPTS - attempts));
//        } while (guess != secret && attempts < MAX_ATTEMPTS);


        while (guess != secret && attempts < MAX_ATTEMPTS) {
            System.out.println("Your guess is:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println("太小");
            } else if (guess > secret) {
                System.out.println("太大");
            }
            System.out.println("剩餘次數:" + (MAX_ATTEMPTS - attempts));
        }
        if (guess == secret) {
            System.out.println("Congrats!!你嘗試了:" + attempts + "次");
        } else {
            System.out.println("GuessNumber: Game over!!!正確數字為：" + secret);
        }

    }
}
