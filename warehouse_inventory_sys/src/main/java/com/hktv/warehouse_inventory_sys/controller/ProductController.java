package com.hktv.warehouse_inventory_sys.controller;

import com.hktv.warehouse_inventory_sys.model.Product;
import com.hktv.warehouse_inventory_sys.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("product")
    public List<Product> getProduct() {
        return this.productRepository.findAll();
    }
}
