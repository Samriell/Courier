package com.example.laba5;

public abstract class Package {
    private String size;
    private boolean fragility;
    private String transportationRequirements;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isFragility() {
        return fragility;
    }

    public void setFragility(boolean fragility) {
        this.fragility = fragility;
    }

    public String getTransportationRequirements() {
        return transportationRequirements;
    }

    public void setTransportationRequirements(String transportationRequirements) {
        this.transportationRequirements = transportationRequirements;
    }

    public abstract String getPackageType();
}

