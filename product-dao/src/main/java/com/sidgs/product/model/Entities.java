package com.sidgs.product.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by ayeluri on 3/4/2017.
 */
@javax.persistence.Entity
@Table (name = "GENIE_ENTITIES")
public class Entities {

    @Column
    String entityType ;
    @Column
    String entityId ;
}
