package com.sidgs.dao;

import com.sidgs.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

/**
 * Created by Vytlasai on 2/23/2017.
 */

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void addProduct(Product product) {
        sessionFactory.getCurrentSession().saveOrUpdate(product);
    }

    @SuppressWarnings("unchecked")
    public List<Product> getAllProducts() {
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }

    @Override
    public void deleteProduct(Integer productId) {
        Product product = (Product) sessionFactory.getCurrentSession().load(Product.class, productId);

        if (null != product){
            this.sessionFactory.getCurrentSession().delete(product);
        }
    }

    public Product updateProduct(Product product) {
        sessionFactory.getCurrentSession().update(product);
        return product;
    }

    public Product getProduct(int productId) {
        return (Product) sessionFactory.getCurrentSession().get(Product.class, productId);
    }
}
