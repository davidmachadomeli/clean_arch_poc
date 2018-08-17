package com.mercadolibre.poc.entities;

public class User {

    private int loyaltyLevel = 0;

    public User(int loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public int getLoyaltyLevel() {
        return this.loyaltyLevel;
    }
}
