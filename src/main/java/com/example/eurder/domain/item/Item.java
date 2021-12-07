package com.example.eurder.domain.item;

public class Item {
    private final String name;
    private final String description;
    private final double price;
    private int amount;

    public Item(String name, String description, double price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }
}
