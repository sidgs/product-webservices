package com.sidgs.product.model;

import javax.persistence.*;

@Entity
@Table (name = "ADDRESS")
public class Address {

    @Column(name = "ADDR_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;


    @Column (name = "ADDR_LINE_1")
    String line1;

    @Column (name = "ADDR_LINE_2")
    String line2;

    @Column (name = "ADDR_CITY")
    String city;

    @Column (name = "ADDR_STATE")
    String state;

    @Column (name = "ADDR_ZIP")
    String zip;

    @Column (name = "ADDR_COUNTRY")
    String country ;

    @Column (name = "ADDR_TYPE")
    String type ;

}
