package com.sidgs.product.impl.jpa;

import com.sidgs.product.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String productName);
}
