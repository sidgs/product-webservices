package com.sidgs.dao;

import com.sidgs.model.Product;

import java.util.List;

/**
 * Created by Vytlasai on 2/23/2017.
 */
public interface ProductDao {

    public void addProduct(Product product);

    public List<Product> getAllProducts();

    public void deleteProduct (Integer productId);

    public Product updateProduct (Product product);

    public Product getProduct (int productId);



}
