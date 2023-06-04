package com.example.laba5;

public class Document extends Package {
    private String senderReceiver;

    public Document() {
        setSize("Small");
    }

    public Document(boolean fragility, String transportationRequirements, String sourceDestinationAddress) {
        setSize("Small");
        setFragility(fragility);
        setTransportationRequirements(transportationRequirements);
        this.senderReceiver = sourceDestinationAddress;
    }

    public String getSourceDestinationAddress() {
        return senderReceiver;
    }

    public void setSourceDestinationAddress(String sourceDestinationAddress) {
        this.senderReceiver = sourceDestinationAddress;
    }

    @Override
    public String getPackageType() {
        return "Document";
    }
}


