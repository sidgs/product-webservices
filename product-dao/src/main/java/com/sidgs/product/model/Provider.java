package com.sidgs.product.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="GENIE_PROVIDER")

public class Provider {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column (name = "PROVIDER_BIZ_NAME" , nullable = false)
    String name ;

    @Column (name = "PROVIDER_TIN" , nullable = false, unique = true)
    String tin;

    @OneToOne (optional = false)
    Entities entities;

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    @OneToMany (cascade = CascadeType.ALL)
    Set<Address> addressList = new HashSet<Address>();

    public Set<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Set<Address> addressList) {
        this.addressList = addressList;
    }

    public void addAddressToList( Address address) {
        addressList.add(address);
    }

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
