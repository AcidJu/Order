package com.example.eurder.service.dtos;

import java.util.UUID;

public class CreateItemDto {
    private String name;
    private String description;
    private double price;
    private int amount;

    public String getName() {
        return name;
    }

    public CreateItemDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateItemDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public CreateItemDto setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public CreateItemDto setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
