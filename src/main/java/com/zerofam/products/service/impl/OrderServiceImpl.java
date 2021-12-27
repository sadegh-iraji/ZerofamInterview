package com.zerofam.products.service.impl;

import com.zerofam.products.model.Order;
import com.zerofam.products.repository.OrderRepository;
import com.zerofam.products.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final OrderRepository orderRepository;

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
