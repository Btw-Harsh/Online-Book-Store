package com.example.onlinebookstore.service;

import com.example.onlinebookstore.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    void deleteOrder(Long id);
    Order placeOrder(Long userId, List<Long> bookIds);

}
