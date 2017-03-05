package com.sidgs.product.repositories;

import com.sidgs.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String productName);
}
