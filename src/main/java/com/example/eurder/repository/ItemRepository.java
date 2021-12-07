package com.example.eurder.repository;

import com.example.eurder.domain.item.Item;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class ItemRepository {

    private final Map<UUID, Item> items = new HashMap<>();

    public ItemRepository() {
    }

    public Item save(Item item) {
        items.put(item.getId(), item);
        return item;
    }
}
