package com.example.interfaces.dependency_inversion.functional_interfaces;

public class Bird implements Sounding {

    @Override
    public void makeSound() {
        System.out.println("Птица поет");
    }
}
