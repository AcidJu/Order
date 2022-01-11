package com.example.eurder.service;

import com.example.eurder.domain.item.Item;
import com.example.eurder.domain.itemgroup.ItemGroup;
import com.example.eurder.domain.order.Order;
import com.example.eurder.repository.ItemRepository;
import com.example.eurder.repository.OrderRepository;
import com.example.eurder.service.dtos.CreateOrderDto;
import com.example.eurder.service.dtos.OrderDto;
import com.example.eurder.service.mappers.OrderMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepository orderRepository, ItemRepository itemRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
        this.orderMapper = orderMapper;
    }

    public OrderDto createOrder(CreateOrderDto createOrderDto) {
        Order order = orderMapper.mapCreateOrderDtoToOrder(createOrderDto);
        orderRepository.save(order);
        setShippingTime(order);
        return orderMapper.mapOrderToOrderDto(order);
    }

    private void setShippingTime(Order order){
        for(ItemGroup itemGroup : order.getItemGroupList()){
            Item item = itemRepository.getItemById(itemGroup.getItemId());
            if(item.getAmount() == 0){
                itemGroup.setShippingDate(LocalDate.now().plusDays(7));
            }
            else {
                itemGroup.setShippingDate(LocalDate.now().plusDays(1));
            }
        }
    }
}
