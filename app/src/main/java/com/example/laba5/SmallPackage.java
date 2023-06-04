package com.example.laba5;

public class SmallPackage extends Package {
    public SmallPackage() {
        setSize("Small");
        setTransportationRequirements("");
    }

    public SmallPackage(boolean fragility, String transportationRequirements) {
        setSize("Small");
        setTransportationRequirements(transportationRequirements);
        setFragility(fragility);
    }

    @Override
    public String getPackageType() {
        return "Small Package";
    }
}
