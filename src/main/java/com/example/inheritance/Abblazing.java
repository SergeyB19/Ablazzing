package com.example.inheritance;

public class Abblazing extends Human {
    public Abblazing(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 15_000");
    }

}
