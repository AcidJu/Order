package com.example.eurder.domain.order;

import com.example.eurder.domain.itemgroup.ItemGroup;

import java.util.*;
import java.util.UUID;

public class Order {

    private final UUID id;
    private final UUID userId;
    private final List<ItemGroup> itemGroupList;

    public Order(UUID userId, List<ItemGroup> itemGroupList) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.itemGroupList = itemGroupList;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public List<ItemGroup> getItemGroupList() {
        return itemGroupList;
    }
}
