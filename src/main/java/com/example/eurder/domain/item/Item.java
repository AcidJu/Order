package com.example.eurder.domain.item;

import java.util.UUID;

public class Item {
    private final UUID id;
    private final String name;
    private final String description;
    private final double price;
    private int amount;

    public Item(ItemBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.amount = builder.amount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public static final class ItemBuilder {
        private UUID id;
        private String name;
        private String description;
        private double price;
        private int amount;

        private ItemBuilder() {
        }

        public static ItemBuilder itemBuilder() {
            return new ItemBuilder();
        }

        public ItemBuilder withId(UUID id) {
            this.id = id;
            return this;
        }

        public ItemBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ItemBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ItemBuilder withAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
