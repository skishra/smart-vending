package com.skrahaman.VendingMachine;

import java.util.Date;

public class Donut extends Snack {
    public Donut(String name, double price, Date expirationDate) {
        super(name, price, expirationDate, "Food", "Sweet");
    }
}
