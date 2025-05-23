package org.example;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        System.out.println("正常執行");
        String path = "";
        //Exception 受檢
        try {
            FileReader reader = new FileReader(path);
            reader.close();
        } catch (IOException e) {
            System.out.println("檔案讀取錯誤");
        }

        String numberStr = "1231231eeeee";
        int number;
        //Runtime Exception 非受檢
        number = Integer.parseInt(numberStr);
        System.out.println(number);
    }
}
