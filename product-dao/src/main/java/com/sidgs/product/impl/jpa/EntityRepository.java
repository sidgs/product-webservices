package com.sidgs.product.impl.jpa;

import com.sidgs.product.model.Entities;
import com.sidgs.product.model.Product;
import com.sidgs.product.model.Provider;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EntityRepository extends CrudRepository<Entities, Long> {
}
