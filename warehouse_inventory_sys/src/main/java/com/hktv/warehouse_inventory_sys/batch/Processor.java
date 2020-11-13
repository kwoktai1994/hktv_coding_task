package com.hktv.warehouse_inventory_sys.batch;

import com.hktv.warehouse_inventory_sys.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<Product, Product> {

    public Product process(Product product) throws Exception
    {
        System.out.println("Inserting product : " + product);
        return product;
    }
}
