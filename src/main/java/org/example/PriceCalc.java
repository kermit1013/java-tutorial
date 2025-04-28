package org.example;

public class PriceCalc {
    public static void main(String[] args) {
        double toy = 37;
        int itemCount = 2;
        double totalPrice = 0.0;
        final double TAX_RATE = 0.05;
        double coupon = 15;
        boolean isDiscount = toy < 30;
        coupon = 5;
        // 因為 消費者購買的玩具不符合折扣（isDiscount）的資格
        // ，所以沒有獲得折價券(coupon)
        // isDiscount = T 或 買超過3個玩具
        // 並且 &&
        // 或 ||
        // 反轉 !
        // ! = 不等於
        //提示： 使用 ＆＆
        if (!isDiscount) {
            //61.95
            totalPrice = (toy * itemCount - coupon) * (1 + TAX_RATE);
        } else {
            //77.7
            totalPrice = (toy * itemCount) * (1 + TAX_RATE);
        }
        System.out.print("總價為：" + totalPrice);
    }

}
