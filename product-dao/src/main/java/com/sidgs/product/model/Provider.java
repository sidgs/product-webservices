package com.sidgs.product.model;


import javax.persistence.*;

@Entity
@Table(name="GENIE_PROVIDER")

public class Provider {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column (name = "PROVIDER_BIZ_NAME")
    String name ;
    @Column (name = "EMAIL")
    String tin;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

}
