package com.example.eurder.service.dtos;

import java.time.LocalDate;
import java.util.UUID;

public class ItemGroupDto {
    private UUID id;
    private UUID itemId;
    private double amount;
    private LocalDate shippingDate;

    public ItemGroupDto setId(UUID id) {
        this.id = id;
        return this;
    }

    public ItemGroupDto setItemId(UUID itemId) {
        this.itemId = itemId;
        return this;
    }

    public ItemGroupDto setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public ItemGroupDto setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public UUID getItemId() {
        return itemId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }
}
