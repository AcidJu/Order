package com.example.eurder.service.dtos;

import java.util.*;
import java.util.UUID;

public class OrderDto {
    private UUID id;
    private UUID userId;
    private List<ItemGroupDto> itemGroupDtoList;

    public UUID getId() {
        return id;
    }

    public OrderDto setId(UUID id) {
        this.id = id;
        return this;
    }

    public UUID getUserId() {
        return userId;
    }

    public OrderDto setUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    public List<ItemGroupDto> getItemGroupDtoList() {
        return itemGroupDtoList;
    }

    public OrderDto setItemGroupDtoList(List<ItemGroupDto> itemGroupDtoList) {
        this.itemGroupDtoList = itemGroupDtoList;
        return this;
    }
}
