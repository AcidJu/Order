package com.example.eurder.service.dtos;

import java.util.*;
import java.util.UUID;

public class CreateOrderDto {
    private UUID userId;
    private List<ItemGroupDto> itemGroupDtoList;

    public CreateOrderDto setItemGroupDtoList(List<ItemGroupDto> itemGroupDtoList) {
        this.itemGroupDtoList = itemGroupDtoList;
        return this;
    }

    public CreateOrderDto setUserId(UUID id) {
        this.userId = id;
        return this;
    }

    public UUID getUserId() {
        return userId;
    }

    public List<ItemGroupDto> getItemGroupDtoList() {
        return itemGroupDtoList;
    }
}
