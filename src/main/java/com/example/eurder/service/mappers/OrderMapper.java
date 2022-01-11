package com.example.eurder.service.mappers;

import com.example.eurder.domain.itemgroup.ItemGroup;
import com.example.eurder.domain.order.Order;
import com.example.eurder.service.dtos.CreateOrderDto;
import com.example.eurder.service.dtos.ItemGroupDto;
import com.example.eurder.service.dtos.OrderDto;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class OrderMapper {
    private ItemGroupMapper itemGroupMapper;

    public Order mapCreateOrderDtoToOrder(CreateOrderDto createOrderDto) {
        return new Order(createOrderDto.getUserId(), mapListDtoToList(createOrderDto.getItemGroupDtoList()));
    }


    public OrderDto mapOrderToOrderDto(Order order) {
        return new OrderDto().setId(order.getId()).setItemGroupDtoList(mapLisToListDto(order.getItemGroupList()));

    }

    public List<ItemGroup> mapListDtoToList(List<ItemGroupDto> listToConvert){
        return listToConvert.stream()
                .map(itemGroupDto -> itemGroupMapper.mapGroupItemDtoToGroupItem(itemGroupDto))
                .collect(Collectors.toList());
    }

    public List<ItemGroupDto> mapLisToListDto(List<ItemGroup> listToConvert){
        return listToConvert.stream()
                .map(itemGroupDto -> itemGroupMapper.mapGroupItemToGroupItemDto(itemGroupDto))
                .collect(Collectors.toList());
    }
}
