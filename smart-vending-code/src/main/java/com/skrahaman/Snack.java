package com.skrahaman;

public class Snack {
    private String name;
    private double price;

    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
