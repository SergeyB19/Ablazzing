package com.example.inheritance.instanceof_ex;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] zoo = {cat, dog};
        for (Animal animal : zoo) {
            if (animal instanceof Cat) {
                Cat cat1 = (Cat) animal;
                cat1.sayMeow();
                ((Cat) animal).sayMeow();
            }
            if (animal instanceof Cat cat1) {
                cat1.sayMeow();
            }
        }

    }
}
