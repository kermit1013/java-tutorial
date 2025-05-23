package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    public static void main(String[] args) {
        String fileName = "firstFile.txt";
        String content = "測試java寫入";
        try {
            writeSth(fileName, content);
        } catch (IOException e) {
            System.out.println("寫入發生錯誤");
        }
    }


    public static void writeSth(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
        System.out.println("成功寫入檔案！" + fileName);
    }
}
