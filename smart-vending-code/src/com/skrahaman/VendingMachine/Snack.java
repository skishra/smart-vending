package com.skrahaman.VendingMachine;

import java.util.Date;

public class Snack implements Comparable<Snack>{
    private String name;
    private double price;
    private Date expirationDate;
    private String foodOrDrink;
    private final String flavor;

    public Snack(String name, double price, Date expirationDate, String foodOrDrink, String flavor) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }


    public String getFlavor() {
        return flavor;
    }

    public String getFoodOrDrink () {
        return foodOrDrink;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f", name, price);
    }

    @Override
    public int compareTo(Snack snack) {
        return getName().compareTo(snack.getName());
    }
}
