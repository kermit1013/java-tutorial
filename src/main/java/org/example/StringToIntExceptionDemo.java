package org.example;

public class StringToIntExceptionDemo {
    public static void main(String[] args) {
        String numberStr = "1231231";
        int number;

        try {
            number = Integer.parseInt(numberStr); // 只有可能丟出 throws NumberFormatException
            System.out.println("轉換後的數字為：" + number);
        } catch (ArithmeticException e) {
            System.out.println("計算錯誤");
        } catch (NumberFormatException e) {
            System.out.println("無法將字串轉為數字");
        }
    }
}
