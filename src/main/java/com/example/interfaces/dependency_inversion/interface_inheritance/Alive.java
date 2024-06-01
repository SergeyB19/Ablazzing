package com.example.interfaces.dependency_inversion.interface_inheritance;

public interface Alive extends Eatable, Movable {



    @Override
    default void eat() {
        Eatable.super.eat();
    }
}
