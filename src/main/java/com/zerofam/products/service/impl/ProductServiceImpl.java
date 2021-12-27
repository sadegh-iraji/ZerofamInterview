package com.zerofam.products.service.impl;

import com.zerofam.products.model.Product;
import com.zerofam.products.repository.ProductRepository;
import com.zerofam.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    @Override
    @Transactional
    public void initProducts() {
        if (productRepository.count() == 0){
            productRepository.save(new Product("TV", 25500));
            productRepository.save(new Product("Radio", 4750.5));
            productRepository.save(new Product("Show", 2890.4));
        }
    }
}
