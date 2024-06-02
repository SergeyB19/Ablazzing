package com.example.interfaces.dependency_inversion.functional_interfaces;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}
