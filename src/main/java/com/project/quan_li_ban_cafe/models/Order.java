package com.project.quan_li_ban_cafe.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_order;

    @Column(name = "id_customer")
    private int id_customer;

    @Column(name = "id_staff")
    private int id_staff;

    @Column(name = "order_time")
    private String order_time;

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public void setId_staff(int id_staff) {
        this.id_staff = id_staff;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public int getId_order() {
        return id_order;
    }

    public int getId_customer() {
        return id_customer;
    }

    public int getId_staff() {
        return id_staff;
    }

    public String getOrder_time() {
        return order_time;
    }
}
