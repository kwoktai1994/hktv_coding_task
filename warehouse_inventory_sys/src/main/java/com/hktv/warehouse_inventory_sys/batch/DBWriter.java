package com.hktv.warehouse_inventory_sys.batch;

import com.hktv.warehouse_inventory_sys.model.Product;
import com.hktv.warehouse_inventory_sys.repository.ProductRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DBWriter implements ItemWriter<Product> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void write(List<? extends Product> products) throws Exception {
        System.out.println("Data Saved for Users: " + products);
        productRepository.saveAll(products);
    }
}
