package com.skrahaman;

public class Snack {
    public String name;
    public boolean isFood;
    public boolean isRealSnack;

    public Snack(String name, boolean isFood, boolean isRealSnack) {
        this.name = name;
        this.isFood = isFood;
        this.isRealSnack = isRealSnack;
    }

    @Override
    public String toString() {
        return name;
    }
}