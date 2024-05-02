package com.skrahaman.VendingMachine;

import java.util.Date;

public class Chips extends Snack {
    public Chips(String name, double price, Date expirationDate) {
        super(name, price, expirationDate, "Food", "Savory");
    }
}
