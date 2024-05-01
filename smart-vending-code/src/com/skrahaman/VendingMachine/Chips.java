package com.skrahaman.VendingMachine;

import java.util.Date;

public class Chips extends FoodSnack {
    public Chips(String name, double price, Date expirationDate, FoodSnackFlavorProfile foodSnackFlavorProfile) {
        super(name, price, expirationDate, foodSnackFlavorProfile);
    }
}
