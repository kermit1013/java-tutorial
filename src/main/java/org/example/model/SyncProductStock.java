package org.example.model;

public class SyncProductStock {
    public int quantity = 10; //庫存只有10件

    //synchronized 同步方法關鍵字
    // 在任何時候，只有一個執行緒可以執行這個方法（排隊）
    public synchronized void buyProduct(String customerName) {
        if (quantity > 0) {
            // 模擬處理時間，讓多個執行序有機會同時抵達這裡。
            try {
                //do something : 嘗試跟資料庫連線
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            quantity--;
            System.out.println(customerName + "購買一件商品成功，目前庫存為：" + quantity);
        } else {
            System.out.println(customerName + "購買失敗，庫存不足");

        }
    }
}
