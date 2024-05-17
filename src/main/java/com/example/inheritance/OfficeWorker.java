package com.example.inheritance;

public abstract class OfficeWorker extends Human{
    public OfficeWorker(boolean isMan) {
        super(isMan);
    }

    public void drinkCoffee() {
        System.out.println("Офисный работник пьет кофе");
    }
}
