package org.example;

import net.datafaker.Faker;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ECommerceProductManagement {
    public static void main(String[] args) {
        String[] categories = {"3C", "家用", "服飾", "食品", "書籍"};
        List<Product> productList = initializeProduct(categories);
        showLowStockProduct(productList);
        showTargetCategory("家用", productList);
        //E001 參數錯誤
        publishProduct(productList, categories, 10);
        unPublishProduct(productList);
    }

    private static void unPublishProduct(List<Product> productList) {
        Faker faker = new Faker();
        System.out.println("======= 下架商品 =======");
        if (productList.size() > 0) {
            int randomIndex = faker.random().nextInt(productList.size());
            Product removed = productList.remove(randomIndex);
            System.out.println(removed);
        }
    }

    private static void publishProduct(List<Product> productList, String[] categories, int quantity) {
        Faker faker = new Faker();
        System.out.println("======= 上架商品 =======");
        for (int i = 0; i < quantity; i++) {
            String id = faker.idNumber().valid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(10, 1000));
            int stock = faker.random().nextInt(0, 100);
            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println("已上架：" + product);
        }
    }

    private static void showTargetCategory(String target, List<Product> productList) {

        System.out.println("=======" + target + "=======");
        List<Product> targetCategoryList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(target)) {
                targetCategoryList.add(product);
            }
        }
        for (Product product : targetCategoryList) {
            System.out.println(product);
        }

    }

    private static void showLowStockProduct(List<Product> productList) {
        System.out.println("======= 庫存不足商品 =======");
        List<Product> lowStockProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getStockQuantity() < 10) {
                lowStockProduct.add(product);
            }
        }

        for (Product product : lowStockProduct) {
            System.out.println(product);
        }
    }

    private static List<Product> initializeProduct(String[] categories) {
        Faker faker = new Faker();
        List<Product> productList = new ArrayList<>();
        System.out.println("======= 初始商品 =======");
        for (int i = 0; i < 30; i++) {
            String id = faker.idNumber().valid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(10, 1000));
            int stock = faker.random().nextInt(0, 100);
            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println(product);
        }
        return productList;
    }
}
