package com.sidgs.product.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

/**
 * Created by ayeluri on 3/4/2017.
 */
@javax.persistence.Entity
@Table (name = "GENIE_ENTITIES")
public class Entities {

    @Column (name = "ENTITY_TYPE")
    String entityType ;
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    String entityId ;

    @Column (name = "CREATED_ON")
    Date createdOn = new Date((new java.util.Date()).getTime());

}
