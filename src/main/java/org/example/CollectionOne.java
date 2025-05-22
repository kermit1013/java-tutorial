package org.example;

import net.datafaker.Faker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionOne {
    public static void main(String[] args) {
        Faker faker = new Faker();
        //List<> = new ArrayList<>();
        Set<String> emails = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            String email = faker.internet().emailAddress();
            System.out.println("嘗試新增：" + email);
            boolean added = emails.add(email);
            if (!added) {
                System.out.println("重複，無法新增");
            }
        }

        String duplicatedEmail = emails.iterator().next();
        System.out.println("重複email為：" + duplicatedEmail);
        boolean isAdded = emails.add(duplicatedEmail); //false
        if (!isAdded) {
            System.out.println("重複，無法新增");
        }
        String searchOne = emails.iterator().next();
        String searchTwo = faker.internet().emailAddress();
        String searchThree = "kermit.sung@gmail.com";

        System.out.println("查詢是否存在：" + searchOne);
        System.out.println("查詢結果：" + emails.contains(searchOne));
        System.out.println("查詢是否存在：" + searchTwo);
        System.out.println("查詢結果：" + emails.contains(searchTwo));
        System.out.println("查詢是否存在：" + searchThree);
        System.out.println("查詢結果：" + emails.contains(searchThree));

    }
}
