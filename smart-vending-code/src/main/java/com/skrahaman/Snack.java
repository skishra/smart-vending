package com.skrahaman;

public abstract class Snack {
    private String name;
    private double price;

    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
