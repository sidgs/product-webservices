package com.sidgs.product.impl.jpa;

import com.sidgs.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String productName);
}
