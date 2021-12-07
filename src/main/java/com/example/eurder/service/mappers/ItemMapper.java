package com.example.eurder.service.mappers;

import com.example.eurder.domain.item.Item;
import com.example.eurder.service.dtos.CreateItemDto;
import com.example.eurder.service.dtos.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public static Item mapCreateItemDtoToItem(CreateItemDto newItem) {
        return Item.ItemBuilder.itemBuilder()
                .withName(newItem.getName())
                .withDescription(newItem.getDescription())
                .withPrice(newItem.getPrice())
                .withAmount(newItem.getAmount())
                .build();
    }

    public static ItemDto mapToItemDto(Item item) {
        return new ItemDto()
                .setName(item.getName())
                .setDescription(item.getDescription())
                .setPrice(item.getPrice())
                .setAmount(item.getAmount());
    }
}
