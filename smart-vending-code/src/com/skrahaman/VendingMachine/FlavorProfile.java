package com.skrahaman.VendingMachine;

public class FlavorProfile {
    private Boolean[] flavorProfile = new Boolean[2];

    public FlavorProfile(boolean foodOrDrink) {
        this.flavorProfile[0] = foodOrDrink;
    }

    public Boolean[] getFlavorProfile() {
        return flavorProfile;
    }
}
