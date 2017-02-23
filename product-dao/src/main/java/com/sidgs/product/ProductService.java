package com.sidgs.product;


import com.sidgs.product.error.ProductException;
import com.sidgs.product.model.Product;

import java.util.List;

/**
 * Created by ayeluri on 1/15/2017.
 */
public interface ProductService {

    void add(Product product);
    List<Product> getProducts() throws ProductException;
    Product getProduct(int id);
    void remove(int product_id);
}
