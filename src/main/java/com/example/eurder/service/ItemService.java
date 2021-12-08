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
    private ItemMapper itemMapper;

    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemDto addNewItem(CreateItemDto newItem) {
        Item item = itemMapper.mapCreateItemDtoToItem(newItem);
        return itemMapper.mapToItemDto(item);
    }
}
