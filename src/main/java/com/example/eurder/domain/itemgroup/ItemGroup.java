package com.example.eurder.domain.itemgroup;

import java.time.LocalDate;
import java.util.UUID;

public class ItemGroup {

    private final UUID id;
    private final UUID itemId;
    private final double amount;
    private LocalDate shippingDate;

    public ItemGroup(UUID itemId, double amount, LocalDate shippingDate) {
        this.id = UUID.randomUUID();
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = shippingDate;
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

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }
}
