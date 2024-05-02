package com.skrahaman.VendingMachine;

import java.util.Date;

public class Soda extends Snack {
    public Soda(String name, double price, Date expirationDate) {
        super(name, price, expirationDate, "Drink", "Artificial");
    }
}
