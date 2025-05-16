package org.example;

public class Iteration {
    public static void main(String[] args) {
        // 基本for迴圈：從0印到9


//        // 計算1到5的總和
        System.out.println("\n計算總和：");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
//            sum = FunctionExample.add(sum, i);
            sum += i;
            System.out.println("加入 " + i + "，目前總和為: " + sum);
        }
        System.out.println("最終總和: " + sum);


        //array 陣列 []
        String[] fruitBox = {"apple", "banana", "peach", "pineapple"};
        String[] clothes = {"長袖", "短秀", ",."};
        //1 basic for
        for (int i = 0; i < 5; i++) {
            System.out.println(fruitBox[i]);
        }

        //2 enhanced for ：不管長度多少 走完就對了！
        //遍例
        for (String fruit : fruitBox) {
            if (fruit == "apple") {
                continue;
            }
            System.out.println(fruit);
        }


        String[] customers = {"kermit", "henry", "jack", "joanne"};

        for (String customer : customers) {
            System.out.println(customer);
        }

        //宣告 double [] 裡面有六個數字 1.0 ,2.0...  enhanced for
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        for (double number : numbers) {
            if (number % 2 != 0) {
                System.out.println("奇數：" + number);
                continue;
            }
            System.out.println("偶數：" + number);
        }
        // 奇數：1.0
        // 偶數：2.0
        // 奇數：3.0
        // 偶數：4.0
        // 奇數：5.0


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
