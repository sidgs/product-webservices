package com.sidgs.product.impl;


import javax.sql.DataSource;
import javax.xml.crypto.Data;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class Springconfig {

    @Value("${jdbc.classname}")
    String driverClassName = "";

    @Value("${jdbc.driverUrl}")
    String driverUrl = "" ;

    @Value("${jdbc.username}")
    String username = "";

    @Value("${jdbc.password}")
    String password = "" ;

@Bean
@Scope (value = "singleton")
public DataSource getDataSorce(){

    BasicDataSource basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName(driverClassName);
    basicDataSource.setUrl(driverUrl);
    basicDataSource.setUsername(username);
    basicDataSource.setPassword(password);
    return  basicDataSource;
}

    @Autowired
    DataSource dataSource;

@Bean
public JdbcTemplate jdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(dataSource);
    return jdbcTemplate;
}



	
	
}
