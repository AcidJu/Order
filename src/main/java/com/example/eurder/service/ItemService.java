package com.example.eurder.service;

import com.example.eurder.domain.item.Item;
import com.example.eurder.repository.ItemRepository;
import com.example.eurder.service.dtos.CreateItemDto;
import com.example.eurder.service.dtos.ItemDto;
import com.example.eurder.service.mappers.ItemMapper;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemDto addNewItem(CreateItemDto newItem) {
        Item item = ItemMapper.mapCreateItemDtoToItem(newItem);
        return ItemMapper.mapToItemDto(item);
    }
}
