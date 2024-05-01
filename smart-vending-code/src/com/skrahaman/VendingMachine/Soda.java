package com.skrahaman.VendingMachine;

import java.util.Date;

public class Soda extends Drink{
    public Soda(String name, double price, Date expirationDate, DrinkFlavorProfile drinkFlavorProfile) {
        super(name, price, expirationDate, drinkFlavorProfile);
    }
}
