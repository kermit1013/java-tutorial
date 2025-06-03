package org.example.model;

public class Customer extends Thread {
    private string name;
    private ProductStock stock;
    private SyncProductStock syncStock;
    private boolean isSync;

    public Customer(String name, ProductStock stock, boolean isSync) {
        this.name = name;
        this.stock = stock;
        this.isSync = isSync;
    }

    public Customer(String name, SyncProductStock syncStock, boolean isSync) {
        this.name = name;
        this.syncStock = syncStock;
        this.isSync = isSync;

    }

    @Override
    public void run() {
        if (isSync) {
            // 同步 ProductStock
            syncStock.buyProduct(name);
        } else {
            // 非同步 ProductStock
            stock.buyProduct(name);
        }
    }
}
