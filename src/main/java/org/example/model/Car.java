package org.example.model;

public class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accSpeed(int acc) {
        if (acc > 0) {
            speed += acc;
        }
    }

    public void getSpeed() {
        System.out.println("當前速度：" + speed);
    }
}

