package com.example.eurder.service.mappers;

import com.example.eurder.domain.itemgroup.ItemGroup;
import com.example.eurder.service.dtos.ItemGroupDto;

public class ItemGroupMapper {
    public ItemGroup mapGroupItemDtoToGroupItem(ItemGroupDto itemGroupDto) {
        return new ItemGroup(itemGroupDto.getItemId(), itemGroupDto.getAmount(), itemGroupDto.getShippingDate());
    }

    public ItemGroupDto mapGroupItemToGroupItemDto(ItemGroup itemGroup) {
        return new ItemGroupDto().setId(itemGroup.getId())
                .setItemId(itemGroup.getItemId())
                .setAmount(itemGroup.getAmount())
                .setShippingDate(itemGroup.getShippingDate());
    }
}
