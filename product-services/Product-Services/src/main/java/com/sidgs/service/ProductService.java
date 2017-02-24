package com.sidgs.service;

import com.sidgs.model.Product;

import java.util.List;

/**
 * Created by Vytlasai on 2/23/2017.
 */
public interface ProductService {

    public void addProduct (Product product);
    public List<Product> getAllProducts();
    public void deleteProduct(Integer productId);
    public Product getProduct(int productId);
    public Product updateEmployee (Product product);

}
