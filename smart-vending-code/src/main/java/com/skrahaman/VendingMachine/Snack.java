package com.skrahaman.VendingMachine;

public class Snack {
    private String name;
    private double price;

    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f", name, price);
    }
}
