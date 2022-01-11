package com.example.eurder.repository;

import com.example.eurder.domain.order.Order;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.HashMap;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class OrderRepository {

    private final HashMap<UUID, Order> orders = new HashMap<>();

    public OrderRepository() {

    }


    public Order save(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    public HashMap<UUID, Order> getItems() {
        return orders;
    }

    public List<Order> getAll() {
        return orders.values().stream().collect(Collectors.toList());
    }

    public Order getLastOrderAdded(){
        return getAll().get(getAll().size()-1);
    }

    public Order getOrderById(UUID id) {
        return orders.get(id);
    }
}
