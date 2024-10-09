package com.project.quan_li_ban_cafe.models;

import jakarta.persistence.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_customer;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "address")
    private String address;

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getId_customer() {return id_customer;}
    public String getFullname() {
        return fullname;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }
}
