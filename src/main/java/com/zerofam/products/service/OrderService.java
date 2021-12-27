package com.zerofam.products.service;

import com.zerofam.products.model.Order;

import java.util.Optional;

public interface OrderService {

    Optional<Order> findById(Long id);

    Order save(Order order);
}
