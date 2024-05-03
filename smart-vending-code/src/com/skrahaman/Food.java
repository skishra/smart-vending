package com.skrahaman;

public class Food extends Snack {
    public boolean isSweet;

    public Food(String name, boolean isSweet, boolean isRealSnack) {
        super(name, true, isRealSnack);
        this.isSweet = isSweet;
    }
}