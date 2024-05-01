package com.skrahaman.VendingMachine;

import java.util.Date;

public class Drink extends Snack{
    public Drink(String name, double price, Date expirationDate, DrinkFlavorProfile drinkFlavorProfile) {
        super(name, price, expirationDate, drinkFlavorProfile);
    }
}
