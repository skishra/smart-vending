package com.skrahaman.VendingMachine;

public class DrinkFlavorProfile extends FlavorProfile{
    boolean naturalOrArtificial;

    public DrinkFlavorProfile(boolean naturalOrArtificial) {
        super(true);
        this.getFlavorProfile()[1]=naturalOrArtificial;
    }
}
