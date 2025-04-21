package org.example;

public class LeapYear {
    public static void main(String[] args) {
        // 1. 創建Scanner物件獲取輸入
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("請輸入年份: ");

        // 常見錯誤：忘記處理輸入非整數的情況
        if (!scanner.hasNextInt()) {
            System.out.println("請輸入有效的整數年份!");
            scanner.next(); // 清除錯誤輸入
            System.out.print("請重新輸入年份: ");
        }
        int year = scanner.nextInt();

        // 2. 閏年判斷邏輯
        boolean isLeapYear;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // 3. 輸出結果
        System.out.println(year + "年是" + (isLeapYear ? "閏年" : "平年"));

        // 關閉Scanner (良好習慣)
        scanner.close();
    }
}
