package com.skrahaman;

public class Drink extends Snack {
    public boolean isNatural;

    public Drink(String name, boolean isNatural, boolean isRealSnack) {
        super(name, false, isRealSnack);
        this.isNatural = isNatural;
    }
}