package org.example2;
///just one column of the same snack should be stacks
//a linked list of stacks?
public abstract class Snack implements Purchasable{
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
