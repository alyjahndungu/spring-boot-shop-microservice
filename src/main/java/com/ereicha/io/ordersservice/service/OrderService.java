package com.ereicha.io.ordersservice.service;

import com.ereicha.io.ordersservice.dto.OrderDto;

public interface OrderService {

    String placeOrder(OrderDto orderDto);

}
