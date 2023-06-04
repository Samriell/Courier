package com.example.laba5;

public class BigPackage extends Package {
    private double weight;

    public BigPackage() {
        setSize("Big");
        setTransportationRequirements("Need auto");
    }

    public BigPackage(boolean fragility, double weight) {
        setSize("Big");
        setTransportationRequirements("Водитель");
        setFragility(fragility);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getPackageType() {
        return "Big Package";
    }
}

