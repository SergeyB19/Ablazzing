package com.example.interfaces.dependency_inversion.functional_interfaces;

@FunctionalInterface
public interface Sounding {
    void makeSound();

    default void doSomething() {
        System.out.println("Делаю что-то");
    }
}
