package com.skrahaman.VendingMachine;

public class FoodSnackFlavorProfile extends FlavorProfile{
    public FoodSnackFlavorProfile(boolean sweetOrSavory) {
        super(false);
        this.getFlavorProfile()[1] = sweetOrSavory;
    }
}
