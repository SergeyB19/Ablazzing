package com.example.interfaces.dependency_inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Dog dog1, Dog dog2) {
        System.out.println("dog");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }


    public DogZoo(Poodle poodle, Shepherd shepherd) {
        System.out.println("poodle and shepherd");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }

}
