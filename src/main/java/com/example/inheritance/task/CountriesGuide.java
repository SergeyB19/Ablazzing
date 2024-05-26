package com.example.inheritance.task;

public class CountriesGuide {
    public static final Country FRANCE = new Country(67_000_000L, "Французкий", "Евразия");
    public static final Country ARGENTINA = new Country(47_000_000L, "Испанский", "Южная Америка");
    public static final Country ITALY = new Country(58_000_000L, "Итальянский", "Евразия");

    private CountriesGuide() {
    }
}
