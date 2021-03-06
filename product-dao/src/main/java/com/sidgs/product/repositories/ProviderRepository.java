package com.sidgs.product.repositories;

import com.sidgs.product.model.Product;
import com.sidgs.product.model.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}
