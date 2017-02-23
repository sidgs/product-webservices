package com.sidgs.product.impl;

import com.sidgs.product.ProductService;
import com.sidgs.product.error.MemberException;
import com.sidgs.product.error.ProductException;
import com.sidgs.product.model.Member;
import com.sidgs.product.model.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vytlasai on 2/22/2017.
 */

@Service
public class ProductServiceImpl1 implements ProductService {


    Log logger = LogFactory.getLog(this.getClass());

    DataSource dataSource = null ;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void add(Product product) {

    }

    public List<Product> getProducts() throws ProductException{

        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        List<Product> products = new ArrayList<Product>();
        try {
            logger.debug("Creating connection");
            connection = dataSource.getConnection();

            statement = connection.createStatement();

            String sql = "select * from product";

            logger.info("Running - " + sql);

            result = statement.executeQuery(sql);

            while ( result.next()) {

                Product product = new Product();
                product.setId(result.getInt("product_id"));
                product.setName(result.getString("product_name"));
                product.setDescription(result.getString("description"));
                product.setStyle(result.getString("product_style"));
                product.setImage(result.getString("product_image"));
                product.setBrand(result.getString("product_brand"));
                products.add(product);
            }

    } catch (Exception e) {
            logger.warn(e.getMessage(),e);
            throw new ProductException(e);
        } finally {
            try {
                result.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                statement.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                connection.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

        }

        return products;
        }


    public Product getProduct(int id) {
        return null;
    }

    public void remove(int product_id) {

    }
}
