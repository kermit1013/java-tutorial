package org.example;

import net.datafaker.Faker;

import java.security.KeyStore;
import java.util.*;

public class ActivityRegistration {
    public static void main(String[] args) {
        Faker faker = new Faker();
//        String[] gender = {"男", "女"};
        Map<String, String> registeredUsers = new HashMap<>();
        System.out.println("==活動報名==");
        int numberOfAttempts = 100;
        int successfulRegistration = 0;


        for (int i = 0; i < numberOfAttempts; i++) {
//            String uniqueId = gender[faker.random().nextInt(gender.length)];
            String uniqueId = faker.internet().uuid();
            String userName = faker.funnyName().name();
            System.out.println("嘗試報名：" + userName);
            //0. 都不能理解
            //1. 先判斷List是否「包含」嘗試報名的用戶
            //2. frequency
            registeredUsers.put(uniqueId, userName);

        }


        System.out.println("==報名結束==");
        System.out.println("嘗試報名人數：" + numberOfAttempts);
        System.out.println("成功報名人數：" + registeredUsers.size());

        System.out.println("==報名成功列表==");
        if (registeredUsers.isEmpty()) {
            System.out.println("沒有人報名成功");
        } else {
            System.out.println(registeredUsers);

            // 遍歷所有keys
            for (String key : registeredUsers.keySet()) {
                System.out.println(key + " : " + registeredUsers.get(key));
            }
            // 遍歷所以key and val
//            for (Map.Entry<String, String> entry : registeredUsers.entrySet()) {
//                System.out.println(entry.getKey() + " : " + entry.getValue());
//            }
            //補充： forEach
            registeredUsers.forEach((key, value) -> {
                System.out.println("Key: " + key + ", Value: " + value);
            });

        }
    }
}
