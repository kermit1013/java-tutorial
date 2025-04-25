package org.example;

public class Iteration {
    public static void main(String[] args) {
        // 基本for迴圈：從0印到9
        System.out.println("基本for迴圈：");
        for (int i = 0; i < 10; i++) {
            System.out.println("計數: " + i);
        }

        // 計算1到5的總和
        System.out.println("\n計算總和：");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
//            sum = FunctionExample.add(sum, i);
            sum += i;
            System.out.println("加入 " + i + "，目前總和為: " + sum);
        }
        System.out.println("最終總和: " + sum);


        //array 陣列 []
        String[] fruits = {"apple", "banana", "peach", "pineapple"};
//        System.out.println(fruits[0]);
//        System.out.println(fruits[1]);
//        System.out.println(fruits[2]);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 提示：
        // 1. 使用雙層for迴圈
        // 2. 外層控制行數，內層控制空格和星號
        // 3. 範例輸出：
        //    *
        //   ***
        //  *****
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // 換行
            System.out.println();
        }
    }
}
