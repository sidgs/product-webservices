package com.sidgs.product.impl;


import javax.sql.DataSource;

import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SprngMemberServiceImpl {
    Log logger = LogFactory.getLog(this.getClass());
    
@Bean
public DriverManagerConnectionFactory getConn(){
DriverManagerConnectionFactory conn =  new DriverManagerConnectionFactory("http://stp-e-catalog.cfsf6pdw4xmo.us-east-1.rds.amazonaws.com/", "aemdev","aemdev");
return conn;
    }
@Bean
public JdbcTemplate jdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource((DataSource) getConn());
    return jdbcTemplate;
}



	
	
}
