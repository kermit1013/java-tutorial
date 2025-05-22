package org.example.model;

public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    public Product(String id, String name, String category, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, 商品名稱: %s, 分類: %s, 價格: $%s, 庫存: %s",
                id, name, category, price, stockQuantity);
    }

}