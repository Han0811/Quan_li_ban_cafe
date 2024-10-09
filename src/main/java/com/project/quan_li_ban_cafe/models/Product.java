package com.project.quan_li_ban_cafe.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_product;

    @Column(name = "name_product")
    private String name_product;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private double price;

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private int id_category;

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public int getId_category() {
        return id_category;
    }

    public int getId_product() {
        return id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDetail() {
        return detail;
    }
}

