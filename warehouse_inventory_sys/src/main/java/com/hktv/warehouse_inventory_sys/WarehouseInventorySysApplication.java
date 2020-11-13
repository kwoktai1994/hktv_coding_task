package com.hktv.warehouse_inventory_sys;

import com.hktv.warehouse_inventory_sys.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarehouseInventorySysApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseInventorySysApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String[] args) throws Exception {
    }
}
