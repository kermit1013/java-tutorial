package org.example;

import net.datafaker.Faker;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class GenerateCSVFile {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String fileName = "user.csv";
        int numberOfUser = 100;
        //try with resource
        try (
                //MAC User
//                FileWriter fileWriter = new FileWriter(fileName);
                // Windows User
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);

                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            bufferedWriter.write("名字, Email, 電話");
            bufferedWriter.newLine();
            for (int i = 0; i < numberOfUser; i++) {
                String name = faker.name().fullName();
                String email = faker.internet().emailAddress();
                String phone = faker.phoneNumber().phoneNumber();

                bufferedWriter.write(String.format("%s,%s,%s", name, email, phone));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("檔案寫入時發生錯誤：" + e.getMessage());
        }
    }
}
