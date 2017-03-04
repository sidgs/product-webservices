package com.sidgs.product.model;


import javax.persistence.*;

@Entity
@Table(name="MEMBER")

public class Member {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column (name = "FIRST_NAME")
    String firstName ;
    @Column (name = "LAST_NAME")
    String lastName ;
    @Column (name = "EMAIL")
    String email ;
    @Column (name = "GENDER")
    String gender;
    @Column (name = "TELE_PHONE")
    String telephone;
    @Column (name = "USER_ID")
    String userid ;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
