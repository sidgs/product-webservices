package com.sidgs.product.model;

import javax.persistence.*;


@Entity
@Table (name = "GENIE_SERVICE")
public class Service {

    @Column(name = "SERVICE_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column (name = "SERVICE_NAME")
    String name ;

    @Column (name = "SERVICE_DESC")
    String description ;


}
