package com.example.eurder.repository;

import com.example.eurder.domain.item.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.HashMap;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class ItemRepository {

    private final HashMap<UUID, Item> items = new HashMap<>();

    public ItemRepository() {
    }

    public Item save(Item item) {
        items.put(item.getId(), item);
        return item;
    }

    public HashMap<UUID, Item> getItems() {
        return items;
    }

    public List<Item> getAll() {
        return items.values().stream().collect(Collectors.toList());
    }

    public Item getItemById(UUID id) {
        return items.get(id);
    }
}
