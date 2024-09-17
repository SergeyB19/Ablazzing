package com.example.Dependency_injection_Практика;

public class Practice {
    public static void main(String[] args) {
        Car zvorykinCar = new Car("ZvorykinCar");
        zvorykinCar.investigateSpeed100();

        Car superCar = new Car("SuperCar",400);
        superCar.investigateSpeed100();

        Garage garage = new Garage();
        garage.setCar1(zvorykinCar);
        garage.setCar2(superCar);
        garage.getInfoAboutCars();
    }
}
