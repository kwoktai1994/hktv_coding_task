package com.hktv.warehouse_inventory_sys.repository;

import com.hktv.warehouse_inventory_sys.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
