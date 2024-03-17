package com.skrahaman;
// just one column of the same snack should be stacks
// a linked list of stacks?
// no, an arraylist of stacks
//
public abstract class Snack implements Purchase{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
