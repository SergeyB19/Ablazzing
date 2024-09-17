package com.example.Dependency_injection_Практика;

public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void investigateSpeed100() {
        double speed = (double) 110 / ((double) this.maxSpeed / 20);
        System.out.printf("Скорость разгона до 100 км/ч :  %s\n",speed);
    }

    public String getBrand() {
        return brand;
    }
}
