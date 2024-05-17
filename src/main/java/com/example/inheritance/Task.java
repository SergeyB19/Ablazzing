package com.example.inheritance;

public class Task {
    public static void main(String[] args) {
        Abblazing abblazing = new Abblazing(true);
        Secretary secretary = new Secretary(false);
        AccountingManager accountingManager = new AccountingManager(true);

        abblazing.getSalary();
        secretary.getSalary();
        secretary.drinkCoffee();
        accountingManager.getSalary();
    }
}
