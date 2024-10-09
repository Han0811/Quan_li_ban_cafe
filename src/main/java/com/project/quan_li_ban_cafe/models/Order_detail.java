package com.project.quan_li_ban_cafe.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order+detail")
public class Order_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_order_detail;

    @Column(name = "id_order")
    private int id_order;

    @Column(name = "id_product")
    private int id_product;

    @Column(name = "price")
    private double price;

    @Column(name = "amount")
    private double amount;

    public void setId_order_detail(int id_order_detail) {
        this.id_order_detail = id_order_detail;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId_order_detail() {
        return id_order_detail;
    }

    public int getId_order() {
        return id_order;
    }

    public int getId_product() {
        return id_product;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}
