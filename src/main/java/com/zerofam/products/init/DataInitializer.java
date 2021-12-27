package com.zerofam.products.init;

import com.zerofam.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    final ProductService productService;

    @PostConstruct
    public void initData() {
        initProducts();
    }

    private void initProducts() {
        productService.initProducts();
    }
}
