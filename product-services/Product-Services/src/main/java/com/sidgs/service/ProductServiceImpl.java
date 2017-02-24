package com.sidgs.service;

import com.sidgs.dao.ProductDao;
import com.sidgs.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Vytlasai on 2/23/2017.
 */
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();

    }

    @Override
    @Transactional
    public void deleteProduct(Integer productId) {
        productDao.deleteProduct(productId);
    }

    @Override
    public Product getProduct(int productId) {
        return productDao.getProduct(productId);
    }

    @Override
    public Product updateEmployee(Product product) {
        return productDao.updateProduct(product);
    }

    public void setProductDao(ProductDao productDao){
        this.productDao = productDao;
    }
}
