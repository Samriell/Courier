package com.example.laba5;

import java.util.ArrayList;
import java.util.Random;

public class Courier {
    private String fullName;
    private String currentAccount;
    private String potential;
    private ArrayList<Order> orders = new ArrayList<>();

    public Courier() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int digit;
        for (int i = 0; i < 20; ++i) {
            digit = random.nextInt(10);
            sb.append(digit);
        }
        currentAccount = sb.toString();

    }

    public Courier(String fullName, String potential) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int digit;
        for (int i = 0; i < 16; ++i) {
            if (i % 4 == 0) {
                sb.append(' ');
            }
            digit = random.nextInt(10);
            sb.append(digit);
        }
        currentAccount = sb.toString();
        this.fullName = fullName;
        this.potential = potential;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(String currentAccount) {
        this.currentAccount = currentAccount;
    }

    public String getPotential() {
        return potential;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}

