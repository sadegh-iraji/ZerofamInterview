package com.zerofam.products.controller;

import com.zerofam.products.model.Order;
import com.zerofam.products.model.enumeration.Status;
import com.zerofam.products.service.OrderService;
import com.zerofam.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OrderController {

    final ProductService productService;

    final OrderService orderService;

    @PostMapping("/createOrder")
    public Order createOrUpdateOrder(@RequestBody Order order){
        // check if the order exists
        if (order.getId() != null){
            Order presentOrder = orderService.findById(order.getId()).get();
            presentOrder.setStatus(order.getStatus());
            presentOrder.setProducts(order.getProducts());
            return orderService.save(presentOrder);
        }
        return orderService.save(order);
    }

    @GetMapping("/updateStatus")
    public Order updateOrderStatus(@RequestParam String status,
                                   @RequestParam String id){
        Order order = orderService.findById(Long.parseLong(id)).get();
        order.setStatus(Status.valueOf(status));
        return orderService.save(order);
    }

}
