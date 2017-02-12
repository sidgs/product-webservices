package com.sidgs.product.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sidgs.product.ProductService;
import com.sidgs.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

//step 1 ; indicated that this is a sprign service
@Service
public class ProductServiceImpl implements ProductService {

	// Step 2 : added a jdbctemplate and indicated that is autowired; i.e. provided by the spring bean factory at startup
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void add(Product product) {
		// TODO Auto-generated method stub

	}

	public List<Product> getProducts() {
		//step 3 :
		String sql ="Select * from products";
		//step 4: Decided to use a rowmapped to get the inforamation about our product
		List<Product>  products = jdbcTemplate.query(sql, new ProductRowMapper<Product>());
		return getProductsfromSQL(sql, null);
	}

	private List<Product> getProductsfromSQL(String sql, Object[] args) {
		List<Product>  products ;
		if ( args != null || args.length!= 0 ) {
			products = jdbcTemplate.query(sql, args, new ProductRowMapper<Product>());
		} else  {
				products = jdbcTemplate.query(sql, new ProductRowMapper<Product>());
			}
		return products;
	}

	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int product_id) {
		// TODO Auto-generated method stub

	}

}

//step 5: we created a class that implements a rowmapper
// this takes a Result set from the execution of the SQL statement against the DB and
// provides a list of products as product beans
class ProductRowMapper<Product>  implements RowMapper<Product> {

	public Product mapRow(ResultSet resultSet, int i) throws SQLException {
		com.sidgs.product.model.Product product;
		product = new com.sidgs.product.model.Product();
		product.setId(resultSet.getInt("id"));

		return (Product) product;
	}
}
