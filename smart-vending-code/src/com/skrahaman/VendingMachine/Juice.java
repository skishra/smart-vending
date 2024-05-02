package com.skrahaman.VendingMachine;

import java.util.Date;

public class Juice extends Snack {
    public Juice(String name, double price, Date expirationDate) {
        super(name, price, expirationDate, "Drink", "Natural");
    }
}
