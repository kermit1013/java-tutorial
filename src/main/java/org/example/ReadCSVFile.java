package org.example;

import org.example.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String fileName = "user.csv";
        int gmailCount = 0;
        int hotmailCount = 0;
        int yahooCount = 0;
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            if ((line = bufferedReader.readLine()) != null) {
                System.out.println("標題為:" + line);
            }
            while ((line = bufferedReader.readLine()) != null) {
                //Jean McCullough,lisha.robel@yahoo.com,(274) 279-5107
                String[] data = line.split(",");
                //Object User
                User user = new User(data[0], data[1], data[2]);
                user.setEmailProvider(data[1]);
                System.out.println(user);
                // user 存到資料庫 ...
                // 數據分析
                // 分析 email服務商 個別有幾個
                //moises.stanton@gmail.com
                switch (user.getEmailProvider()) {
                    case "gmail.com":
                        gmailCount++;
                        break;
                    case "yahoo.com":
                        yahooCount++;
                        break;
                    case "hotmail.com":
                        hotmailCount++;
                        break;
                }
            }
            System.out.printf("gmail為： %s, yahoo為： %s, hotmail為： %s", gmailCount, yahooCount, hotmailCount);
        } catch (IOException exception) {
            System.out.println("檔案讀取有誤：" + exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("用戶資料不完整：" + exception.getMessage());
        }
    }
}
