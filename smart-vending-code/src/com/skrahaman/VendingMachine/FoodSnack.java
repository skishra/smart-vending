package com.skrahaman.VendingMachine;

import java.util.Date;

public class FoodSnack extends Snack{
    public FoodSnack(String name, double price, Date expirationDate, FoodSnackFlavorProfile foodSnackFlavorProfile) {
        super(name, price, expirationDate, foodSnackFlavorProfile);
    }
}
