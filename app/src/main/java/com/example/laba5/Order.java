package com.example.laba5;

public class Order {
    private Company company;
    private Package aPackage;
    private String sourceAddress;
    private String destinationAddress;
    private int price;

    public Order() {
    }

    public Order(Company company, Package aPackage, String sourceAddress, String destinationAddress, int price) {
        this.company = company;
        this.aPackage = aPackage;
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public Order(Company company, String sourceAddress, String destinationAddress, int price) {
        this.company = company;
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

