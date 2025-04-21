package org.example;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // 提示：
        // 1. BMI公式：體重(kg) / (身高(m)^2)
        // 2. 分類標準：
        //    - BMI < 18.5 : 過輕
        //    - 18.5 <= BMI < 24 : 正常
        //    - BMI >= 24 : 過重
        java.util.Scanner scanner = new Scanner(System.in);

        // 1. 輸入身高(米)和體重(公斤)
        System.out.print("請輸入您的身高(米): ");
        double height = scanner.nextDouble();

        System.out.print("請輸入您的體重(公斤): ");
        double weight = scanner.nextDouble();
        double bmi = weight / height * height;
        System.out.println("請輸入您的BMI: "+ bmi);
        int result;
        if (bmi < 18.5) {
            result = 1;
        } else if (18.5 <= bmi && bmi < 24 ) {
            result = 2;
        } else {
            result = 3;
        }

        switch (result) {
            case 1 :
                System.out.print("過輕");
                break;
            case 2:
                System.out.print("正常");
                break;
            case 3:
                System.out.print("過重");
                break;
        }
    }
}
