package com.skrahaman.VendingMachine;

import java.util.Date;

public class Snack implements Comparable<Snack>{
    private String name;
    private double price;
    private Date expirationDate;
    private FlavorProfile flavorProfile;

    public Snack(String name, double price, Date expirationDate, FlavorProfile flavorProfile) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.flavorProfile = flavorProfile;
    }

    public String getName() {
        return name;
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
